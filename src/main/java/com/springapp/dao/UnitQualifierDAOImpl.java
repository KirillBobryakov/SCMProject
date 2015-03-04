package com.springapp.dao;

import com.springapp.domain.PackingInfo;
import com.springapp.domain.UnitQualifier;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */

@Repository
public class UnitQualifierDAOImpl implements UnitQualifierDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<UnitQualifier> listUnitQualifiers() {
        return sessionFactory.getCurrentSession().createQuery("from UnitQualifier ").list();
    }

    @Override
    public UnitQualifier getUnitQualifierById(Integer id) {
        Query query = sessionFactory.getCurrentSession().createQuery(
                "from UnitQualifier unitQualifier where unitQualifier.id = :unitQualifierId");
        query.setParameter("unitQualifierId", id);

        return (UnitQualifier) query.list().get(0);
    }
}
