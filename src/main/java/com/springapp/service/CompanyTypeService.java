package com.springapp.service;

import com.springapp.domain.Address;
import com.springapp.domain.CompanyType;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface CompanyTypeService {

    public List<CompanyType> listCompanyTypes();

    public CompanyType getCompanyTypeById(Integer id);

}
