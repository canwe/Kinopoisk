package com.itis.dz.repositories;

import com.itis.dz.entities.Person;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Регина on 08.10.2016.
 */
@Repository
public class PersonRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public Person getPersonByid(Long id) {
        return (Person) sessionFactory.getCurrentSession().createCriteria(Person.class).add(Restrictions.idEq(id)).uniqueResult();
    }

}
