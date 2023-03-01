package cinema.tickets.booking.cinematicketbooking.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cinema.tickets.booking.cinematicketbooking.models.Movies;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long>{
    @Query("SELECT new movies(m.id, m.title, m.description, COALESCE(AVG(r.rate), 0.0)) FROM movies m JOIN rates r WHERE m.id=?1")
    public Movies getSingleMovieById(long id);

    @Query("SELECT new movies(m.id, m.title, m.description, COALESCE(AVG(r.rate), 0.0)) FROM movies m LEFT JOIN m.rates r GROUP BY m.id")
    public List<Movies> getAllMovies();

    @Query("SELECT AVG(r.rate) AS rate FROM movies m JOIN rates r WHERE m.id = ?1")
    public Double getAVG(long id);
}
