/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 26.03.2019
 */
package at.fhv.persistencespring.repository;

import org.springframework.data.repository.CrudRepository;

import at.fhv.persistencespring.entities.Language;

public interface LanguageRepository extends CrudRepository<Language, Integer> {
	
	Language findBy_id(Integer id);

}
