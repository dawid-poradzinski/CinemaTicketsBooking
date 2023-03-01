package cinema.tickets.booking.cinematicketbooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cinema.tickets.booking.cinematicketbooking.models.PeoplePrivate;
import cinema.tickets.booking.cinematicketbooking.repositories.PeoplePrivateRepository;
import cinema.tickets.booking.cinematicketbooking.repositories.PeopleRepository;

@RestController
public class PeoplePrivateController {
    
    @Autowired
    PeoplePrivateRepository peoplePrivateRepository;

    @Autowired
    PeopleRepository peopleRepository;

    @PutMapping("/ppl/addPpl")
    public void savePpl(@RequestBody PeoplePrivate peoplePrivate){
        peoplePrivateRepository.save(peoplePrivate);
    }
}
