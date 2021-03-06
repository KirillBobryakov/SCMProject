package com.springapp.service;

import com.springapp.dao.AddressDAO;
import com.springapp.dao.CompanyDAO;
import com.springapp.domain.Address;
import com.springapp.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDAO companyDAO;
    @Autowired
    private AddressDAO addressDAO;

    @Transactional
    public List<Company> listCompanies() {
        return companyDAO.listCompanies();
    }


    @Transactional
    public List<Company> listCompaniesByTypeId(Integer companyTypeId) {
        return companyDAO.listCompaniesByTypeId(companyTypeId);
    }

    @Transactional
    public void addCompany(Company company) {
        company.setAddressByAddress(addressDAO.getAddressById(company.getAddress()));
        companyDAO.addCompany(company);
    }

    @Transactional
    public List<Company> listCompaniesByType(String companyType) {
        if(CompanyTypeService.IMPORTER.equals(companyType)){
            return listCompaniesByTypeId(1);
        } else if(CompanyTypeService.FOREIGN.equals(companyType)){
            return listCompaniesByTypeId(2);
        } else if(CompanyTypeService.TRANSPORT.equals(companyType)){
            return listCompaniesByTypeId(3);
        } else if(CompanyTypeService.CUSTOM_SERVICE.equals(companyType)){
            return listCompaniesByTypeId(4);
        } else return null;
    }
}
