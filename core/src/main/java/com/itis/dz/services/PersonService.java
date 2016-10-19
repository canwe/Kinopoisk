package com.itis.dz.services;

import com.itis.dz.entities.Person;
import com.itis.dz.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Регина on 08.10.2016.
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person getPersonById(Long id) {
        return personRepository.getPersonByid(id);
    }
}
