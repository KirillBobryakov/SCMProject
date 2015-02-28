package com.springapp.service;

import com.springapp.dao.CountryDAO;
import com.springapp.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDAO countryDAO;

    @Transactional
    public void addCountry(Country country) {
        countryDAO.addCountry(country);

    }

    @Transactional
    public List<Country> listCountries() {
        return countryDAO.listCountry();
    }

    @Transactional
    public void removeCountry(Integer id) {
        countryDAO.removeCountry(id);
    }
}
