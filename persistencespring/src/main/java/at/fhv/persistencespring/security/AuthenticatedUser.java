package at.fhv.persistencespring.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import at.fhv.persistencespring.entities.Role;
import at.fhv.persistencespring.entities.User;

/**
 * @author Ramesh Fadatare
 *
 */
public class AuthenticatedUser extends org.springframework.security.core.userdetails.User{

	private static final long serialVersionUID = 1L;
	private User _user;
	
	public AuthenticatedUser(User user){
		super(user.getUsername(), user.getPassword(), getAuthorities(user));
		_user = user;
	}
	
	public User getUser(){
		return _user;
	}
	
	private static Collection<? extends GrantedAuthority> getAuthorities(User user){
		Set<String> roleAndPermissions = new HashSet<>();
		List<Role> roles = user.getRoles();
		
		for (Role role : roles){
			roleAndPermissions.add(role.getName());
		}
		String[] roleNames = new String[roleAndPermissions.size()];
		Collection<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(roleAndPermissions.toArray(roleNames));
		return authorities;
	}
}
