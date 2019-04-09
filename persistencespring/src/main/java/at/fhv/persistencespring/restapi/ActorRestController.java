/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 07.04.2019
 */
package at.fhv.persistencespring.restapi;

import java.util.List;

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

import at.fhv.persistencespring.entities.Actor;
import at.fhv.persistencespring.repository.ActorRepository;

@RestController
@RequestMapping("/rest/actor")
public class ActorRestController {
	@Autowired
	private ActorRepository _actorRepository;
	
	@GetMapping
    public ResponseEntity<Iterable<Actor>> findAll() {
        return ResponseEntity.ok(_actorRepository.findAll());
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<Actor> findById(Integer id) {
        return ResponseEntity.ok(_actorRepository.findBy_id(id));
    }
	
	@PostMapping
    public ResponseEntity<Actor> create(@Valid @RequestBody Actor actor) {
        return ResponseEntity.ok(_actorRepository.save(actor));
    }
	
	@PutMapping("/{id}")
    public ResponseEntity<Actor> update(@PathVariable Integer id, @Valid @RequestBody Actor actor) {
        Actor act = _actorRepository.findBy_id(id);
		if (_actorRepository.findBy_id(id) == null) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(_actorRepository.save(actor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Actor> delete(@PathVariable Integer id) {
        if (_actorRepository.findBy_id(id) == null) {
            ResponseEntity.badRequest().build();
        }
        _actorRepository.delete(id);
        return ResponseEntity.ok().build();
    }
	

}
