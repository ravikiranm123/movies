package com.training.mf.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.mf.model.MovieModel;
import com.training.mf.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public MovieModel getByMovieID(String id) {
		return movieRepository.findById(id).isPresent() ? movieRepository.findById(id).get() : null;
	}
	
	public List<MovieModel> getByMovieName(String name) {
		List<MovieModel> moviesList = new ArrayList<>();
		movieRepository.findByMovieNameContainingIgnoreCase(name).forEach(movie -> moviesList.add(movie));
		return moviesList;
//		return movieRepository.findByMovieNameContaining(name).isEmpty()
//				? movieRepository.findByMovieNameContaining(name) : null;
	}
	
	public List<MovieModel> getByMovieCollection(Long from, Long to){
		List<MovieModel> moviesList = new ArrayList<>();
		movieRepository.findByCollectionBetween(from, to).forEach(movie -> moviesList.add(movie));
		return moviesList;
	}
	
	public boolean addMovie(MovieModel movie) {
		movieRepository.save(movie);
		if (movieRepository.findById(movie.getMovieID()).isEmpty()) {
			return false;
		}
		return true;
	}
}
