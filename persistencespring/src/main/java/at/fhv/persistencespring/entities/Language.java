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
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Language {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer _id;
	
	@Column(name="name")
	private String _name;
	
	@OneToMany(mappedBy="_language")
	@Cascade(CascadeType.SAVE_UPDATE)
	private Collection<Film> _films = new ArrayList<Film>();
	
	protected Language() {
		
	}
	
	public Language(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
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
