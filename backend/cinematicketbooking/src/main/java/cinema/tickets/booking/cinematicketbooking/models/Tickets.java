package cinema.tickets.booking.cinematicketbooking.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "tickets")
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;
    @Column(name = "salt")
    private String salt;
    @Column(name = "seat")
    private int seat;
    @Column(name = "used")
    private boolean used;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Films.class)
    @JoinColumn(name = "film_id")
    private Films film;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = People.class)
    @JoinColumn(name = "people_id")
    private People people;
}
