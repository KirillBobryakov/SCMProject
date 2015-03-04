package com.springapp.dao;

import com.springapp.domain.PackingInfo;
import com.springapp.domain.UnitQualifier;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface UnitQualifierDAO {


    public List<UnitQualifier> listUnitQualifiers();

    public UnitQualifier getUnitQualifierById(Integer id);

}
