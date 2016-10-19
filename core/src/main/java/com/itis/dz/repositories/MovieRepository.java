package com.itis.dz.repositories;

import com.itis.dz.entities.Movie;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Регина on 08.10.2016.
 */
@Repository
public class MovieRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public Movie getMovieById(Long id) {
        return (Movie) sessionFactory.getCurrentSession().createCriteria(Movie.class).add(Restrictions.idEq(id)).uniqueResult();
    }

    public List<Movie> getMovies() {
        return sessionFactory.getCurrentSession().createCriteria(Movie.class).list();
    }
}
