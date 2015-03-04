package com.springapp.service;

import com.springapp.dao.CountryDAO;
import com.springapp.dao.CurrencyDAO;
import com.springapp.domain.Country;
import com.springapp.domain.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyDAO currencyDAO;

    @Transactional
    public List<Currency> listCurrencies() {
        return currencyDAO.listCurrencies();
    }

    @Transactional
    public String getCodeAlfaByCurrencyId(Integer currencyId) {
        return currencyDAO.getCodeAlfaByCurrencyId(currencyId);
    }
}
