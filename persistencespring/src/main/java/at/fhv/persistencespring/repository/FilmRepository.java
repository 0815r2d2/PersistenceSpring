/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 26.03.2019
 */
package at.fhv.persistencespring.repository;

import org.springframework.data.repository.CrudRepository;

import at.fhv.persistencespring.entities.Film;

public interface FilmRepository extends CrudRepository<Film, Integer>{

}
