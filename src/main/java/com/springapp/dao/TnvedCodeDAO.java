package com.springapp.dao;

import com.springapp.domain.Address;
import com.springapp.domain.TnvedCode;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface TnvedCodeDAO {


    public List<TnvedCode> listTnvedCodes();

    public TnvedCode getTnvedCodeById(Integer id);

}
