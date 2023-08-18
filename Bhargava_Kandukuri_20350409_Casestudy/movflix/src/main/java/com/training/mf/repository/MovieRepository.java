package com.training.mf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.mf.model.MovieModel;

public interface MovieRepository extends JpaRepository<MovieModel, String>{

	public List<MovieModel> findByMovieNameContainingIgnoreCase(String name);
	
	public List<MovieModel> findByCollectionBetween(Long from, Long to);
}
