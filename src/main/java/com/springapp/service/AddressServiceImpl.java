package com.springapp.service;

import com.springapp.dao.AddressDAO;
import com.springapp.dao.CountryDAO;
import com.springapp.domain.Address;
import com.springapp.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDAO addressDAO;

    @Transactional
    public List<Address> listAddresses() {
        return addressDAO.listAddresses();
    }

    @Transactional
    public Address getAddressById(Integer id) {
        return addressDAO.getAddressById(id);
    }
}
