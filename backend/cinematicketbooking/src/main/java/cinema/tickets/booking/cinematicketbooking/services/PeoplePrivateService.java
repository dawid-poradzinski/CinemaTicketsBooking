package cinema.tickets.booking.cinematicketbooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cinema.tickets.booking.cinematicketbooking.repositories.PeoplePrivateRepository;

@Service
public class PeoplePrivateService {
    @Autowired
    public PeoplePrivateRepository peoplePrivateRepository;

    
}
