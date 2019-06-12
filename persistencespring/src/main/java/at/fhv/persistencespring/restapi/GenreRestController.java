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

import at.fhv.persistencespring.entities.Genre;
import at.fhv.persistencespring.repository.GenreRepository;

@RestController
@RequestMapping("/rest/genre")
public class GenreRestController {
	
	@Autowired
	private GenreRepository _genreRepository;
	
	@GetMapping
    public ResponseEntity<Iterable<Genre>> findAll() {
        return ResponseEntity.ok(_genreRepository.findAll());
    }
	
	@PostMapping
    public ResponseEntity<Genre> create(@Valid @RequestBody Genre genre) {
        return ResponseEntity.ok(_genreRepository.save(genre));
    }
	
	@PutMapping("/{id}")
    public ResponseEntity<Genre> update(@PathVariable Integer id, @Valid @RequestBody Genre genre) {
		if (_genreRepository.findBy_id(id) == null) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(_genreRepository.save(genre));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Genre> delete(@PathVariable Integer id) {
        if (_genreRepository.findBy_id(id) == null) {
            ResponseEntity.badRequest().build();
        }
        _genreRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
