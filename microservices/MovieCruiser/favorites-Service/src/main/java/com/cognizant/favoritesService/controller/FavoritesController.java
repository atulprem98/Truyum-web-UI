package com.cognizant.favoritesService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.favoritesService.FavoritesServiceApplication;
import com.cognizant.favoritesService.exception.FavoritesEmptyException;
import com.cognizant.favoritesService.model.Favorites;
import com.cognizant.favoritesService.service.FavoritesService;


@RestController
@RequestMapping("/movies/favorites")
public class FavoritesController {

	@Autowired
	private FavoritesService favService;
	
	private static Logger log= LoggerFactory.getLogger(FavoritesServiceApplication.class);
	
	@GetMapping("/{userId}")
	public Favorites getAllFavorites(@PathVariable int userId) throws FavoritesEmptyException{
		log.info("Start get favorites");
		return favService.getAllFavorites(userId);
	}
	
	@PostMapping("/{userId}/{movieId}")
	public void addToFavorites(@PathVariable int userId, @PathVariable int movieId) {
		log.info("Start adding to favorites");
		favService.addToFavorites(userId, movieId);
	}
	
	@DeleteMapping("/{userId}/{movieId}")
	public void removeFavMovie(@PathVariable int userId, @PathVariable int movieId) throws FavoritesEmptyException{
		log.info("Start delete from favorites");
		favService.removeFavMovie(userId, movieId);
	}
}
