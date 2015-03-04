package com.springapp.dao;

import com.springapp.domain.Company;
import com.springapp.domain.Currency;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface CurrencyDAO {

    public List<Currency> listCurrencies();

    public String getCodeAlfaByCurrencyId(Integer currencyId);


}
