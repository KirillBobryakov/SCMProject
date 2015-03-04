package com.springapp.dao;

import com.springapp.domain.Good;
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
public class GoodDAOImpl implements GoodDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Good> listGoods() {
        return sessionFactory.getCurrentSession().createQuery("from Good ").list();
    }

    @Override
    public Good getGoodById(Integer id) {
        Query query = sessionFactory.getCurrentSession().createQuery(
                "from Good good where good.id = :goodId");
        query.setParameter("goodId", id);

        return (Good) query.list().get(0);
    }
}
