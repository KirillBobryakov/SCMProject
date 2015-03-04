package com.springapp.service;

import com.springapp.domain.Country;
import com.springapp.domain.Currency;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface CurrencyService {

    public List<Currency> listCurrencies();

    public String getCodeAlfaByCurrencyId(Integer currencyId);


}
