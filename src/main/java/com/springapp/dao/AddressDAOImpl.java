package com.springapp.dao;

import com.springapp.domain.Address;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */

@Repository
public class AddressDAOImpl implements AddressDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<Address> listAddresses() {
        return sessionFactory.getCurrentSession().createQuery("from Address ").list();
    }

    @Override
    public Address getAddressById(Integer id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Address address where address.id = :addressId");
        query.setParameter("addressId", id);

        return (Address) query.list().get(0);
    }
}
