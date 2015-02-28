package com.springapp.dao;

import com.springapp.domain.Country;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface CountryDAO {

    public void addCountry(Country country);

    public List<Country> listCountry();

    public void removeCountry(Integer id);


}
