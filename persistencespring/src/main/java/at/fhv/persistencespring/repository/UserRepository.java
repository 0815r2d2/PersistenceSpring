/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 15.04.2019
 */
package at.fhv.persistencespring.repository;

import org.springframework.data.repository.CrudRepository;

import at.fhv.persistencespring.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	User findBy_username(String username);

}
