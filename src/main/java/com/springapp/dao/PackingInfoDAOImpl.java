package com.springapp.dao;

import com.springapp.domain.PackingInfo;
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
public class PackingInfoDAOImpl implements PackingInfoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<PackingInfo> listPackingInfo() {
        return sessionFactory.getCurrentSession().createQuery("from PackingInfo ").list();
    }

    @Override
    public PackingInfo getPackingInfoById(Integer id) {
        Query query = sessionFactory.getCurrentSession().createQuery(
                "from PackingInfo packingInfo where packingInfo.id = :packingInfoId");
        query.setParameter("packingInfoId", id);

        return (PackingInfo) query.list().get(0);
    }
}
