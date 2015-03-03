package com.springapp.dao;

import com.springapp.domain.Address;
import com.springapp.domain.Company;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface CompanyDAO {

    public void addCompany(Company company);
    public List<Company> listCompanies();

    public List<Company> listCompaniesByTypeId(Integer companyTypeId);


}
