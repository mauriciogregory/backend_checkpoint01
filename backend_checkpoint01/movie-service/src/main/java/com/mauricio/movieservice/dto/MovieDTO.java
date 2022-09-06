package com.mauricio.movieservice.dto;

import com.mauricio.movieservice.entities.Movie;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MovieDTO {

    private Long id;
    private String name;
    private String genre;
    private String urlStream;


    public MovieDTO(Movie entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.genre = entity.getGenre();
        this.urlStream = entity.getUrlStream();
    }


}
