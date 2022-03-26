package com.jproject.app.services;

import com.jproject.app.entities.Person;
import com.jproject.app.repositories.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private  PeopleRepository peopleRepository;

    public PersonService(PeopleRepository peopleRepository){
        this.peopleRepository = peopleRepository;
    }

    public PersonService() {
    }

    public List<Person> getAll(){
       return (List<Person>) peopleRepository.findAll();
    }

    public void something(){
    }

    public void addPerson(Person person){
        //peopleRepository.q
        peopleRepository.save(person);
    }
    public int getNumOfAllUsers(){
        if(peopleRepository!=null)
            return (int) peopleRepository.count();
        else return 0;
    }

}
