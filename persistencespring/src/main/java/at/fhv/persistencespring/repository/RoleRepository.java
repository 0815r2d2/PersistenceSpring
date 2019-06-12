/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 15.04.2019
 */
package at.fhv.persistencespring.repository;

import org.springframework.data.repository.CrudRepository;

import at.fhv.persistencespring.entities.Role;
import at.fhv.persistencespring.entities.User;

public interface RoleRepository extends CrudRepository<Role, Integer>{

}
