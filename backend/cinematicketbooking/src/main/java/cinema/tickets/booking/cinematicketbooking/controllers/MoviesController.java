package cinema.tickets.booking.cinematicketbooking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cinema.tickets.booking.cinematicketbooking.models.Movies;
import cinema.tickets.booking.cinematicketbooking.services.MoviesService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class MoviesController {

    @Autowired
    public MoviesService moviesService;

    // Dodawanie
    @PutMapping("Movies/add")
    public void addMovie(@RequestBody Movies movie) {
        moviesService.saveMovie(movie);
    }
    // Pobieranie wszytskich Movie
    @PostMapping("Movies/get")
    public List<Movies> getAllMovies(){
        return moviesService.getAllMovies();
    }
    // Edytowanie konkretnego id
    @PutMapping("Movies/{id}/edit")
    public Movies editMovie(@PathVariable long id, @RequestBody Movies movie){
        movie.setId(id);
        moviesService.saveMovie(movie);
        return movie;
    }
    // Pobieranie konkretnego Movie
    @PostMapping("Movies/{id}/get")
    public Movies getMovie(@PathVariable long id){
        return moviesService.getSingleMovieById(id);
    }
    // Usuwanie konkretnego Movie
    @DeleteMapping("Movies/{id}/delete")
    public void deleteMovie(@PathVariable long id){
        moviesService.deleteMovie(id);
    }

}
