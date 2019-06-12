/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 26.03.2019
 */
package at.fhv.persistencespring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Genre")
public class Genre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer _id;
	
	@Column(name="name")
	private String _name;
	
//	@OneToMany(mappedBy="_genre")
//	@LazyCollection(LazyCollectionOption.FALSE)
//	@Cascade(CascadeType.SAVE_UPDATE)
//	private Collection<Film> _films = new ArrayList<Film>();
	
	protected Genre() {
		
	}
	
	public Genre(String name) {
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

//	public Collection<Film> getFilms() {
//		return _films;
//	}
//
//	public void setFilms(Collection<Film> films) {
//		_films = films;
//	}
}
