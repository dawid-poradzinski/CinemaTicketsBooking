package cinema.tickets.booking.cinematicketbooking.repositories;

import org.springframework.data.repository.CrudRepository;

import cinema.tickets.booking.cinematicketbooking.models.PeoplePrivate;

public interface PeoplePrivateRepository extends CrudRepository<PeoplePrivate, Long>
{
    // @Query("select a from people_private a join fetch a.people where a.id = ?1")
    // public PeoplePrivate findPeople(Long id);
}
