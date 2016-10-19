package com.itis.dz.services;

import com.itis.dz.entities.Movie;
import com.itis.dz.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Регина on 08.10.2016.
 */
@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie getMovieById(Long id) {
        return movieRepository.getMovieById(id);
    }

    public List<Movie> getMovies() {
        return movieRepository.getMovies();
    }
}
