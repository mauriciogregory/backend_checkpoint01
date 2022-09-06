package com.mauricio.catalogservice.interfaces;

import com.mauricio.catalogservice.dto.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "movie-service")
public interface CatalogClient {

    @GetMapping("/movie/{genre}")
    List<MovieDTO> getMovies(@PathVariable String genre);

}
