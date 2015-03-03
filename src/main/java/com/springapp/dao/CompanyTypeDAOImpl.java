package com.springapp.dao;

import com.springapp.domain.Address;
import com.springapp.domain.CompanyType;
import com.springapp.domain.Country;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */

@Repository
public class CompanyTypeDAOImpl implements CompanyTypeDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<CompanyType> listCompanyTypes() {
        return sessionFactory.getCurrentSession().createQuery("from CompanyType ").list();
    }

    @Override
    public CompanyType getCompanyTypeById(Integer id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from CompanyType companyType where companyType.id = :companyTypeId");
        query.setParameter("companyTypeId", id);

        return (CompanyType) query.list().get(0);
    }

}
