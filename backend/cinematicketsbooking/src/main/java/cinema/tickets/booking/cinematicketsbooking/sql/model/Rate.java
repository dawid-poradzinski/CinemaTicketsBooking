package cinema.tickets.booking.cinematicketsbooking.sql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "rate")
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;

    @Column(name = "score")
    private double score;

    @Column(name = "text")
    private String text;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = People.class)
    @JoinColumn(name = "people")
    private People people;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Movie.class)
    @JoinColumn(name = "movie")
    private Movie movie;
}
