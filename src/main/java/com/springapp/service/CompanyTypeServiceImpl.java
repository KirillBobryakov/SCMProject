package com.springapp.service;

import com.springapp.dao.AddressDAO;
import com.springapp.dao.CompanyTypeDAO;
import com.springapp.domain.Address;
import com.springapp.domain.CompanyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
@Service
public class CompanyTypeServiceImpl implements CompanyTypeService {

    @Autowired
    private CompanyTypeDAO companyTypeDAO;

    @Transactional
    public List<CompanyType> listCompanyTypes() {
        return companyTypeDAO.listCompanyTypes();
    }

    @Transactional
    public CompanyType getCompanyTypeById(Integer id) {
        return companyTypeDAO.getCompanyTypeById(id);
    }
}
