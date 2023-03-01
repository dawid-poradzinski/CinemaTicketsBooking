package cinema.tickets.booking.cinematicketbooking.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cinema.tickets.booking.cinematicketbooking.models.People;
import cinema.tickets.booking.cinematicketbooking.repositories.PeopleRepository;

@RestController
public class PeopleController {

    @Autowired
    PeopleRepository peopleRepository;

    @PostMapping("/exist/{email}")
    public long checkIfExist(@PathVariable String email){
        try{
            return peopleRepository.findIdByEmail(email);
        }catch(Exception e){
            return -1;
        }
    }

    @PostMapping("/people/{id}")
    public People getUser(@PathVariable long id){
        return peopleRepository.findById(id).get();
    }
}
