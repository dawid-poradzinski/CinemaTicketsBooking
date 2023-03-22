package cinema.tickets.booking.cinematicketsbooking.sql.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "people_private")
@Setter
@Getter
public class PeoplePrivate {

    @Id
    @Column(name = "id", unique = true)
    private long id;
    
    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "rank")
    private Rank rank = Rank.USER;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id")
    private People people;

    public enum Rank{
        USER,
        WORKER,
        ADMIN,
    }
}
