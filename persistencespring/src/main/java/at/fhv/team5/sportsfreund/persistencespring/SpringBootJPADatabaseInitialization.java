/**
 * @author: Bianca Koinegg
 * Version 1.0
 * 26.03.2019
 */
package at.fhv.team5.sportsfreund.persistencespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import at.fhv.team5.sportsfreund.persistencespring.entities.Genre;
import at.fhv.team5.sportsfreund.persistencespring.repository.GenreRepository;
@SpringBootApplication
public class SpringBootJPADatabaseInitialization implements CommandLineRunner{
	
	@Autowired
	private GenreRepository _genreRepository;

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
		Genre genre = new Genre();
		genre.setName("Horror");
		_genreRepository.save(genre);
	}

}
