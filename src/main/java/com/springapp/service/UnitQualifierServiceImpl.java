package com.springapp.service;

import com.springapp.dao.PackingInfoDAO;
import com.springapp.dao.UnitQualifierDAO;
import com.springapp.domain.PackingInfo;
import com.springapp.domain.UnitQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
@Service
public class UnitQualifierServiceImpl implements UnitQualifierService {

    @Autowired
    private UnitQualifierDAO unitQualifierDAO;

    @Transactional
    public List<UnitQualifier> listUnitQualifiers() {
        return unitQualifierDAO.listUnitQualifiers();
    }

    @Transactional
    public UnitQualifier getUnitQualifierById(Integer id) {
        return unitQualifierDAO.getUnitQualifierById(id);
    }
}
