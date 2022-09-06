package com.mauricio.movieservice.services;

import com.mauricio.movieservice.entities.Movie;
import com.mauricio.movieservice.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository repository;

    public List<Movie> getMovies(String genre){
        return repository.findAllByGenre(genre);
    }

}
