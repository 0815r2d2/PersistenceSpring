/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 26.03.2019
 */
package at.fhv.persistencespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import at.fhv.persistencespring.entities.Actor;
import at.fhv.persistencespring.entities.Film;
import at.fhv.persistencespring.entities.Genre;
import at.fhv.persistencespring.entities.Language;
import at.fhv.persistencespring.facade.Facade;
import at.fhv.persistencespring.repository.ActorRepository;
import at.fhv.persistencespring.repository.FilmRepository;
import at.fhv.persistencespring.repository.GenreRepository;
import at.fhv.persistencespring.repository.LanguageRepository;
@SpringBootApplication
public class SpringBootJPADatabaseInitialization {
//implements CommandLineRunner{
	
//	@Autowired
//	private GenreRepository _genreRepository;
//	
//	@Autowired
//	private LanguageRepository _languageRepository;
//	
//	@Autowired 
//	private FilmRepository _filmRespository;
//	
//	@Autowired
//	private Facade _facade;
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJPADatabaseInitialization.class, args);

	}

//	/* (non-Javadoc)
//	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
//	 */
//	@Override
//	public void run(String... arg0) throws Exception {
//		
//
//		Genre horror = new Genre("Horror");
//		Genre fant = new Genre("Fantasy");
//		Genre ac = new Genre("Action");
//		_facade.saveGenre(horror);
//		_facade.saveGenre(fant);
//		_facade.saveGenre(ac);
//
//		Language germ = new Language("Deutsch");
//		Language eng = new Language("Englisch");
//		Language sp = new Language("Spanisch");
//		_facade.saveLanguage(germ);
//		_facade.saveLanguage(eng);
//		_facade.saveLanguage(sp);
//
//		Actor act1 = new Actor("Orlando", "Bloom");
//		Actor act2 = new Actor("Ian", "McKellen");
//		Actor act3 = new Actor("Viggo", "Mortensen");
//		_facade.saveActor(act1);
//		_facade.saveActor(act2);
//		_facade.saveActor(act3);
//
//		Film hdr = new Film("Herr der Ringe", germ, fant);
//
//		hdr.getActors().add(act1);
//		hdr.getActors().add(act2);
//		hdr.getActors().add(act3);
//
//		_facade.saveFilm(hdr);
//	}

}
