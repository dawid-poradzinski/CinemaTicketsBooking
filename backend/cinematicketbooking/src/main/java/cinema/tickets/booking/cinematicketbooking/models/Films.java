package cinema.tickets.booking.cinematicketbooking.models;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "films")
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;
    @Column(name = "date", columnDefinition = "DATE")
    private LocalDateTime date;
    @Column(name = "taken_seats")
    private Set<Integer> takenSeats;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Rooms.class)
    @JoinColumn(name = "room")
    private Rooms room;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Movies.class)
    @JoinColumn(name = "movies_id")
    private Movies movie;
    @OneToMany(mappedBy = "film", targetEntity = Tickets.class)
    private Set<Tickets> tickets;
}
