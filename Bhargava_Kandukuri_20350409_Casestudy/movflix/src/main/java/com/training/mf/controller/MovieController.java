package com.training.mf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.mf.model.MovieModel;
import com.training.mf.service.AdminService;
import com.training.mf.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService service;
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping({"/movflix", "/movflix/"})
	public String viewSearchPage() {
		return "Home";
	}
	
	@GetMapping("/movflix/movid")
	public String viewSearchMovieIdPage() {
		return "SearchMovieIDPage";
	}
	
	@GetMapping("/movflix/movname")
	public String viewSearchMovieNamePage() {
		return "SearchMovieNamePage";
	}
	
	@GetMapping("/movflix/movcollection")
	public String viewSearchMovieCollectionPage() {
		return "SearchMovieCollectionPage";
	}
	
	@GetMapping("/movflix/login")
	public String viewAdminPage() {
		return "LoginPage";
	}
	
	@GetMapping("/movflix/modifymovie")
	public String viewMovieModifyPage() {
		return "ModifyError";
	}
	
	@GetMapping("/movflix/movieadminpage")
	public String viewMovieAdminPage() {
		return "MovieAdminPage";
	}
	
	@GetMapping("/movflix/addmovie")
	public String viewAddMoviePage() {
		return "AddMoviePage";
	}
	
	@PostMapping("/movflix/searchbyid")
	public String viewByMovieID(@RequestParam String id, Model model) {
		MovieModel moviemodel = service.getByMovieID(id);
		if(moviemodel != null) {
			model.addAttribute("movie", moviemodel);
			return "MovieIDPage";
		}
		return "SearchError";
	}
	
	@PostMapping("/movflix/searchbyname")
	public String viewByMovieName(@RequestParam String name, Model model) {
		List<MovieModel> moviemodel = service.getByMovieName(name);
		if(moviemodel.isEmpty()) {
			return "SearchError";
		}
		model.addAttribute("movieslist", moviemodel);
		return "MovieNamePage";
	}
	
	@PostMapping("/movflix/searchbycollection")
	public String viewByMovieCollection(@RequestParam Long from, @RequestParam Long to, Model model) {
		List<MovieModel> moviemodel = service.getByMovieCollection(from, to);
		if(moviemodel.isEmpty()) {
			return "SearchError";
		}
		model.addAttribute("movieslist", moviemodel);
		return "MovieNamePage";
	}
	
	@PostMapping("/movflix/adminpage")
	public String viewAdminPage(@RequestParam String username, @RequestParam String password, Model model) {
		//System.out.println(username + ", " + password);
		//System.out.println(adminService.adminCheck(username, password));
		if(adminService.adminCheck(username, password)) {
			return "MovieAdminPage";
		}
		return "AdminError";
	}
	
	@PostMapping("/movflix/addmovie")
	public String addNewMovie(@ModelAttribute MovieModel movie, Model model) {
		if(service.addMovie(movie)) {
			return "SuccessPage";
		}
		return "Unexpected Error";
	}
}
