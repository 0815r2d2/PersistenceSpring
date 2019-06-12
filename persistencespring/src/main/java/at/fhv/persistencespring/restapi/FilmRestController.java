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

import at.fhv.persistencespring.entities.Film;
import at.fhv.persistencespring.repository.FilmRepository;

@RestController
@RequestMapping("/rest/film")
public class FilmRestController {
	
	@Autowired
	private FilmRepository _filmRepository;
	
	@GetMapping
    public ResponseEntity<Iterable<Film>> findAll() {
        return ResponseEntity.ok(_filmRepository.findAll());
    }
	
	@PostMapping
    public ResponseEntity<Film> create(@Valid @RequestBody Film film) {
        return ResponseEntity.ok(_filmRepository.save(film));
    }
	
	@PutMapping("/{id}")
    public ResponseEntity<Film> update(@PathVariable Integer id, @Valid @RequestBody Film film) {
		if (_filmRepository.findBy_id(id) == null) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(_filmRepository.save(film));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Film> delete(@PathVariable Integer id) {
        if (_filmRepository.findBy_id(id) == null) {
            ResponseEntity.badRequest().build();
        }
        _filmRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
