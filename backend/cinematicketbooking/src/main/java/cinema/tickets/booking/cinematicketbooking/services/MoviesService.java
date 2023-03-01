package cinema.tickets.booking.cinematicketbooking.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cinema.tickets.booking.cinematicketbooking.models.Movies;
import cinema.tickets.booking.cinematicketbooking.repositories.MoviesRepository;

@Service
public class MoviesService {
    
    @Autowired
    public MoviesRepository moviesRepository;

    public void saveMovie(Movies movie){
        moviesRepository.save(movie);
    }

    public Movies getSingleMovieById(long id){
        return moviesRepository.getSingleMovieById(id);
    }

    public void deleteMovie(long id){
        moviesRepository.deleteById(id);
    }

    public List<Movies> getAllMovies(){

        List<Movies> movies = new ArrayList<>();
        
        moviesRepository.getAllMovies().forEach(movies::add);;

        return movies;

    }
}
