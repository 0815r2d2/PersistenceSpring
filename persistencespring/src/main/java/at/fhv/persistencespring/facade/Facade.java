/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 28.03.2019
 */
package at.fhv.persistencespring.facade;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import at.fhv.persistencespring.entities.Actor;
import at.fhv.persistencespring.entities.Film;
import at.fhv.persistencespring.entities.Genre;
import at.fhv.persistencespring.entities.Language;
import at.fhv.persistencespring.entities.Role;
import at.fhv.persistencespring.entities.User;
import at.fhv.persistencespring.repository.ActorRepository;
import at.fhv.persistencespring.repository.FilmRepository;
import at.fhv.persistencespring.repository.GenreRepository;
import at.fhv.persistencespring.repository.LanguageRepository;
import at.fhv.persistencespring.repository.RoleRepository;
import at.fhv.persistencespring.repository.UserRepository;

@Repository
public class Facade {
	@Autowired
	private GenreRepository _genreRepository;
	
	@Autowired
	private LanguageRepository _languageRepository;
	
	@Autowired 
	private FilmRepository _filmRepository;
	
	@Autowired
	private ActorRepository _actorRepository;
	
	@Autowired
	private RoleRepository _roleRepository;
	
	@Autowired
	private UserRepository _userRepository;
	
	public void saveActor(Actor entity) {
		_actorRepository.save(entity);
	}
	
	public void saveGenre(Genre entity) {
		_genreRepository.save(entity);
	}
	
	public void saveLanguage(Language entity) {
		_languageRepository.save(entity);
	}
	
	public void saveFilm(Film entity) {
		_filmRepository.save(entity);
	}
	
	
	public Optional<Actor> loadActor(Integer id) {
		return _actorRepository.findById(id);
	}
	
	public Optional<Genre> loadGenre(Integer id) {
		return _genreRepository.findById(id);
	}
	
	public Optional<Language> loadLanguage(Integer id) {
		return _languageRepository.findById(id);
	}
	
	public Optional<Film> loadFilm(Integer id) {
		return _filmRepository.findById(id);
	}
	
	public void removeActor(Integer id) {
		_actorRepository.deleteById(id);
	}
	
	public void removeGenre(Integer id) {
		_genreRepository.deleteById(id);
	}
	
	public void removeLanguage(Integer id) {
		_languageRepository.deleteById(id);
	}
	
	public void removeFilm(Integer id) {
		_filmRepository.deleteById(id);
	}
	
	public Iterable<Actor> loadAllActors(){
		return _actorRepository.findAll();
	}
	
	public Iterable<Genre> loadAllGenres(){
		return _genreRepository.findAll();
	}
	
	public Iterable<Language> loadAllLanguages(){
		return _languageRepository.findAll();
	}
	
	public Iterable<Film> loadAllFilms(){
		return _filmRepository.findAll();
	}

	/**
	 * @param role1
	 */
	public void saveRole(Role role1) {
		_roleRepository.save(role1);
	}
	
	public void saveUser(User user) {
		_userRepository.save(user);
	}

}
