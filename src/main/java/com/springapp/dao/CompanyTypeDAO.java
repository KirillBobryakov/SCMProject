package com.springapp.dao;

import com.springapp.domain.CompanyType;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface CompanyTypeDAO {


    public List<CompanyType> listCompanyTypes();

    public CompanyType getCompanyTypeById(Integer id);

}
