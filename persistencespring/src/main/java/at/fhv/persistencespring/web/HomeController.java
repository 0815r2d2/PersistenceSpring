package at.fhv.persistencespring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import at.fhv.persistencespring.entities.Film;
import at.fhv.persistencespring.repository.FilmRepository;

/**
 * @author Ramesh Fadatare
 *
 */
@Controller
public class HomeController
{
	@Autowired
	private FilmRepository _filmRepository;
	
	@GetMapping("/home")
	public String home(Model model){
		model.addAttribute("films", _filmRepository.findAll());		
		return "userhome";
	}
	
	@PostMapping("/films")
	public String saveMessage(Film film){
		_filmRepository.save(film);
		return "redirect:/home";
	}
}
