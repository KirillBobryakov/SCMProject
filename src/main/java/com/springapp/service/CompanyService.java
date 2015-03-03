package com.springapp.service;

import com.springapp.domain.Company;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface CompanyService {

    public List<Company> listCompanies();

    public List<Company> listCompaniesByTypeId(Integer companyTypeId);

    public void addCompany(Company company);

}
