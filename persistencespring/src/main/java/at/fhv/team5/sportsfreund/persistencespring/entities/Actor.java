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
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer _id;
	
	@Column(name="fName")
	private String _fName;
	
	@Column(name="lName")
	private String _lName;
	
	@Column(name="residence")
	private String _residence;

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

}
