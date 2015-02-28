package com.springapp.service;

import com.springapp.domain.Address;
import com.springapp.domain.Country;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface AddressService {

    public List<Address> listAddresses();

    public Address getAddressById(Integer id);

}
