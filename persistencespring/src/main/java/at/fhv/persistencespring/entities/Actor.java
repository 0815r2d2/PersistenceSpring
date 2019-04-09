/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 26.03.2019
 */
package at.fhv.persistencespring.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer _id;
	
	@Column(name="fname")
	private String _fName;
	
	@Column(name="lname")
	private String _lName;
	
	@Column(name="residence")
	private String _residence;
	
	@ManyToMany(mappedBy="_actors")
	@LazyCollection(LazyCollectionOption.EXTRA)
	private Collection<Film> _films = new ArrayList<>();
	
	protected Actor() {}
	
	public Actor(String fName, String lName) {
		_fName = fName;
		_lName = lName;
	}

	public String getfName() {
		return _fName;
	}

	public void setfName(String fName) {
		_fName = fName;
	}

	public String getlName() {
		return _lName;
	}

	public void setlName(String lName) {
		_lName = lName;
	}

	public String getResidence() {
		return _residence;
	}

	public void setResidence(String residence) {
		_residence = residence;
	}

	public Integer getId() {
		return _id;
	}

	public Collection<Film> getFilms() {
		return _films;
	}

	public void setFilms(Collection<Film> films) {
		_films = films;
	}

}
