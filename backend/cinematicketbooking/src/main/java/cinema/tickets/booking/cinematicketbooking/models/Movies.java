package cinema.tickets.booking.cinematicketbooking.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

@Entity(name = "movies")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", unique = true, updatable = false)
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "movie", targetEntity = Rates.class, fetch = FetchType.LAZY)
    private Set<Rates> rates;
    // @OneToMany(mappedBy = "movie", targetEntity = Films.class, fetch = FetchType.LAZY)
    // private Set<Films> films;
    @Transient
    private double rate;

    public Movies(){};

    public Movies(long id, String title, String description, Set<Rates> rates, double rate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rates = rates;
        this.rate = rate;
    }

    public Movies(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Movies(long id, String title, String description, double rate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rate = rate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // Tworzenie metody zwracającej powoduje, że nasz typ LAZY nie działa
    // public Set<Rates> getRates() {
    //     return rates;
    // }

    // public void setRates(Set<Rates> rates) {
    //     this.rates = rates;
    // }

    // public Set<Films> getFilms() {
    //     return films;
    // }

    // public void setFilms(Set<Films> films) {
    //     this.films = films;
    // }
    public Double getRate(){
        return rate;
    }
    // public void setRate(Double rate){
    //     this.rate = rate;
    // }

}
