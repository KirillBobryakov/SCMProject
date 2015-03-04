package com.springapp.dao;

import com.springapp.domain.Country;
import com.springapp.domain.Currency;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */

@Repository
public class CurrencyDAOImpl implements CurrencyDAO {


    @Autowired
    private SessionFactory sessionFactory;


    @SuppressWarnings("unchecked")
    public List<Currency> listCurrencies() {
        return sessionFactory.getCurrentSession().createQuery("from Currency ").list();
    }

    @Override
    public String getCodeAlfaByCurrencyId(Integer currencyId) {
        Query query = sessionFactory.getCurrentSession().createQuery(
                "FROM Currency currency WHERE currency.id = :currencyId");
        query.setParameter("currencyId", currencyId);

        Currency currency = (Currency) query.list().get(0);
        if(currency != null){
            return currency.getCodeAlfa();
        }

        return null;
    }
}
