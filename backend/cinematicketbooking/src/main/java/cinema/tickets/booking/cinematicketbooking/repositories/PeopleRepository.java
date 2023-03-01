package cinema.tickets.booking.cinematicketbooking.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cinema.tickets.booking.cinematicketbooking.models.People;

public interface PeopleRepository extends CrudRepository<People, Long>
{
    public boolean existsByEmail(String email);

    @Query("select a.id from people a where a.email = ?1")
    public long findIdByEmail(String email);
}
