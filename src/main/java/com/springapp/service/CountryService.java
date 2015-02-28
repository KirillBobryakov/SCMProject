package com.springapp.service;

import com.springapp.domain.Country;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface CountryService {

    public void addCountry(Country country);

    public List<Country> listCountries();

    public void removeCountry(Integer id);
}
