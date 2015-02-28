package com.springapp.dao;

import com.springapp.domain.Country;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */

@Repository
public class CountryDAOImpl implements CountryDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCountry(Country country) {
        sessionFactory.getCurrentSession().save(country);
    }

    @SuppressWarnings("unchecked")
    public List<Country> listCountry() {
        return sessionFactory.getCurrentSession().createQuery("from Country").list();
    }

    @Override
    public void removeCountry(Integer id) {
        Country country = (Country) sessionFactory.getCurrentSession().load(Country.class, id);
        if(country != null) sessionFactory.getCurrentSession().delete(country);
    }
}
