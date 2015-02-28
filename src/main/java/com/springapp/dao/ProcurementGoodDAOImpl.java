package com.springapp.dao;

import com.springapp.domain.ProcurementGood;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */

@Repository
public class ProcurementGoodDAOImpl implements ProcurementGoodDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addProcurementGood(ProcurementGood procurementGood) {
        sessionFactory.getCurrentSession().save(procurementGood);
    }

    @SuppressWarnings("unchecked")
    public List<ProcurementGood> listProcurementGoods() {
        return sessionFactory.getCurrentSession().createQuery("from ProcurementGood ").list();
    }

    @Override
    public List<ProcurementGood> listProcurementGoods(Integer procurementId) {
        Query query = sessionFactory.getCurrentSession().createQuery(
                "from ProcurementGood procurementGood where procurementGood.procurement = :procurementId");
        query.setParameter("procurementId", procurementId);

        return query.list();
    }

    @Override
    public void removeProcurementGood(Integer id) {
        ProcurementGood procurementGood = (ProcurementGood) sessionFactory.getCurrentSession().load(ProcurementGood.class, id);
        if(procurementGood != null) sessionFactory.getCurrentSession().delete(procurementGood);
    }

    @Override
    public ProcurementGood getProcurementGoodById(Integer id){
        Query query = sessionFactory.getCurrentSession().createQuery(
                "from ProcurementGood procurementGood where procurementGood.id = :procurementGoodId");
        query.setParameter("procurementGoodId", id);
//        Procurement procurement = (Procurement) sessionFactory.getCurrentSession().load(Procurement.class, id);
        return (ProcurementGood) query.list().get(0);
    }
}
