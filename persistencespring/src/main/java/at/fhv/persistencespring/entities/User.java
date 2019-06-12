/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 15.04.2019
 */
package at.fhv.persistencespring.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer _id;
	
	@Column(name ="username")
	private String _username;
	
	@Column(name ="password")
	private String _password;
	
	@ManyToMany
	@JoinTable(
			name="userrole",
			joinColumns = @JoinColumn(name ="userid"),
			inverseJoinColumns = @JoinColumn(name ="roleid")
	)
	private List<Role> _roles = new ArrayList<>();
	
	protected User() {}
	
	public User(String username, String password) {
		_username = username;
		_password = password;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		_username = username;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public List<Role> getRoles() {
		return _roles;
	}

	public void setRoles(List<Role> roles) {
		_roles = roles;
	}

	public Integer getId() {
		return _id;
	}
}
