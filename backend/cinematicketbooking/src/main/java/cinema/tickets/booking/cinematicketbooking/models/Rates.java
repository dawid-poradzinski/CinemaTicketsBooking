package cinema.tickets.booking.cinematicketbooking.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "rates")
public class Rates {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;
    @Column(name = "rate")
    private double rate;
    @Column(name = "text")
    private String text;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = People.class)
    @JoinColumn(name = "people_id")
    private People people;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Movies.class)
    @JoinColumn(name = "movie_id")
    private Movies movie;

    public Rates() {};

    public Rates(long id, double rate, People people, Movies movie) {
        this.id = id;
        this.rate = rate;
        this.people = people;
        this.movie = movie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Movies getMovie() {
        return movie;
    }

    public void setMovie(Movies movie) {
        this.movie = movie;
    }
}
