/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 26.03.2019
 */
package at.fhv.team5.sportsfreund.persistencespring.repository;

import org.springframework.data.repository.CrudRepository;

import at.fhv.team5.sportsfreund.persistencespring.entities.Genre;

public interface GenreRepository extends CrudRepository<Genre, Integer>{

}
