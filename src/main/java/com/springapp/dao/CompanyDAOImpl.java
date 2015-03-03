package com.springapp.dao;

import com.springapp.domain.Address;
import com.springapp.domain.Company;
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
public class CompanyDAOImpl implements CompanyDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<Company> listCompanies() {
        return sessionFactory.getCurrentSession().createQuery("from Company ").list();
    }

    @Override
    public void addCompany(Company company) {
        sessionFactory.getCurrentSession().save(company);
    }

    @Override
    public List<Company> listCompaniesByTypeId(Integer companyTypeId) {
        Query query = sessionFactory.getCurrentSession().createQuery(
                "from Company company where company.type = :companyTypeId");
        query.setParameter("companyTypeId", companyTypeId);

        return query.list();
    }
}
