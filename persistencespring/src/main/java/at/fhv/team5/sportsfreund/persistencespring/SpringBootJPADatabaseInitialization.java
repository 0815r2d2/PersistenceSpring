/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 26.03.2019
 */
package at.fhv.team5.sportsfreund.persistencespring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import at.fhv.team5.sportsfreund.persistencespring.entities.Actor;
import at.fhv.team5.sportsfreund.persistencespring.entities.Film;
import at.fhv.team5.sportsfreund.persistencespring.entities.Genre;
import at.fhv.team5.sportsfreund.persistencespring.entities.Language;
import at.fhv.team5.sportsfreund.persistencespring.repository.ActorRepository;
import at.fhv.team5.sportsfreund.persistencespring.repository.FilmRepository;
import at.fhv.team5.sportsfreund.persistencespring.repository.GenreRepository;
import at.fhv.team5.sportsfreund.persistencespring.repository.LanguageRepository;
@SpringBootApplication
public class SpringBootJPADatabaseInitialization implements CommandLineRunner{
	
	@Autowired
	private GenreRepository _genreRepository;
	
	@Autowired
	private LanguageRepository _languageRepository;
	
	@Autowired 
	private FilmRepository _filmRespository;
	
	@Autowired
	private ActorRepository _actorRepository;
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJPADatabaseInitialization.class, args);

	}

	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... arg0) throws Exception {
//		Genre genre = new Genre("Fantasy");
//		_genreRepository.save(genre);
//		
//		Language language = new Language("Deutsch");
//		_languageRepository.save(language);
//		
		Actor actor = new Actor("Orlando", "Bloom");
		_actorRepository.save(actor);
//		
//		Film film = new Film("Herr der Ringe", language, genre);
//		film.getActors().add(actor);
//		_filmRespository.save(film);
//		
//		actor.setfName("Test");
//		_actorRepository.save(actor);
//		_filmRespository.save(film);

		
		List<Actor> actors1 = _actorRepository.findBy_fName("Orlando");
		System.out.println(actors1.get(0).getfName());
	}

}
