/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 26.03.2019
 */
package at.fhv.persistencespring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import at.fhv.persistencespring.entities.Actor;

public interface ActorRepository extends CrudRepository<Actor, Integer>{
	
	List<Actor> findBy_fName(String firstName);

}
