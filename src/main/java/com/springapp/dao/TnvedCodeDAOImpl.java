package com.springapp.dao;

import com.springapp.domain.Address;
import com.springapp.domain.TnvedCode;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */

@Repository
public class TnvedCodeDAOImpl implements TnvedCodeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<TnvedCode> listTnvedCodes() {
        return sessionFactory.getCurrentSession().createQuery("from TnvedCode ").list();
    }

    @Override
    public TnvedCode getTnvedCodeById(Integer id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from TnvedCode tnvedCode where tnvedCode.id = :tnvedCodeId");
        query.setParameter("tnvedCodeId", id);

        return (TnvedCode) query.list().get(0);
    }
}
