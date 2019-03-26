/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 26.03.2019
 */
package at.fhv.team5.sportsfreund.persistencespring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer _id;
	
	@Column(name="title")
	private String _title;
	
	@Column(name="releaseYear")
	private String _releaseYear;

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getReleaseYear() {
		return _releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		_releaseYear = releaseYear;
	}

	public Integer getId() {
		return _id;
	}
}
