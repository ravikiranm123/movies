package com.training.mf.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class MovieModel {

	@Id
	@Column(name = "MovieID")
	private String movieID;
	@Column(name = "MovieName")
	private String movieName;
	@Column(name = "Collection")
	private Long collection;
	
	public MovieModel() {}

	public String getMovieID() {
		return movieID;
	}

	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Long getCollection() {
		return collection;
	}

	public void setCollection(Long collection) {
		this.collection = collection;
	}
}
