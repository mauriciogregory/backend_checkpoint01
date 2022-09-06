package com.mauricio.movieservice.controllers;

import com.mauricio.movieservice.entities.Movie;
import com.mauricio.movieservice.services.MovieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
@Slf4j
public class MovieController {

    private final MovieService service;

    @GetMapping("/{genre}")
    public ResponseEntity<List<Movie>>getClients(@PathVariable String genre){
        log.info("Api called");
        return ResponseEntity.ok(service.getMovies(genre));
    }

}
