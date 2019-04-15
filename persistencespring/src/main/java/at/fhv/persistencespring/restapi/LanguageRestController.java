/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 07.04.2019
 */
package at.fhv.persistencespring.restapi;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.fhv.persistencespring.entities.Language;
import at.fhv.persistencespring.repository.LanguageRepository;

@RestController
@RequestMapping("/rest/language")
public class LanguageRestController {
	
	@Autowired
	private LanguageRepository _languageRepository;
	
	@GetMapping
    public ResponseEntity<Iterable<Language>> findAll() {
        return ResponseEntity.ok(_languageRepository.findAll());
    }
	
	@GetMapping("/{id}")
    public Language findById(@PathVariable Integer id) {
        return _languageRepository.findBy_id(id);
    }
	
	@PostMapping
    public ResponseEntity<Language> create(@Valid @RequestBody Language language) {
        return ResponseEntity.ok(_languageRepository.save(language));
    }
	
	@PutMapping("/{id}")
    public ResponseEntity<Language> update(@PathVariable Integer id, @Valid @RequestBody Language language) {
		if (_languageRepository.findBy_id(id) == null) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(_languageRepository.save(language));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Language> delete(@PathVariable Integer id) {
        if (_languageRepository.findBy_id(id) == null) {
            ResponseEntity.badRequest().build();
        }
        _languageRepository.delete(id);
        return ResponseEntity.ok().build();
    }

}
