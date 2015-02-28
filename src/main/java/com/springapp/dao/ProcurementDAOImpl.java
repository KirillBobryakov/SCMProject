package com.springapp.dao;

import com.springapp.domain.Country;
import com.springapp.domain.Procurement;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */

@Repository
public class ProcurementDAOImpl implements ProcurementDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addProcurement(Procurement procurement) {
        sessionFactory.getCurrentSession().save(procurement);
    }

    @SuppressWarnings("unchecked")
    public List<Procurement> listProcurements() {
        return sessionFactory.getCurrentSession().createQuery("from Procurement ").list();
    }

    @Override
    public void removeProcurement(Integer id) {
        Procurement procurement = (Procurement) sessionFactory.getCurrentSession().load(Procurement.class, id);
        if(procurement != null) sessionFactory.getCurrentSession().delete(procurement);
    }

    @Override
    public Procurement getProcurementById(Integer id){
        Query query = sessionFactory.getCurrentSession().createQuery(
                "from Procurement procurement where procurement.id = :procurementId");
        query.setParameter("procurementId", id);
//        Procurement procurement = (Procurement) sessionFactory.getCurrentSession().load(Procurement.class, id);
        return (Procurement) query.list().get(0);
    }
}
