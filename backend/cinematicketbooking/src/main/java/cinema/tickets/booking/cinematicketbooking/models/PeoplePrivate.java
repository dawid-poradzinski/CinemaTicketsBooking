package cinema.tickets.booking.cinematicketbooking.models;

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

@Entity(name = "people_private")
public class PeoplePrivate {
    @Id
    @Column(name = "id", unique = true, updatable = false)
    private long id;

    @Column(name = "password")
    private String pass;

    @Enumerated(EnumType.STRING)
    @Column(name = "rank", columnDefinition = "TEXT default 'USER'")
    private Rank rank;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id")
    private People people;

    public enum Rank{
        USER,
        WORKER,
        ADMIN
    }

    public PeoplePrivate(){};

    public PeoplePrivate(long id, String pass, Rank rank, People people) {
        this.id = id;
        this.pass = pass;
        this.rank = rank;
        this.people = people;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

}
