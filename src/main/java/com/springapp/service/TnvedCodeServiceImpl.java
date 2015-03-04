package com.springapp.service;

import com.springapp.dao.AddressDAO;
import com.springapp.dao.TnvedCodeDAO;
import com.springapp.domain.Address;
import com.springapp.domain.TnvedCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
@Service
public class TnvedCodeServiceImpl implements TnvedCodeService {

    @Autowired
    private TnvedCodeDAO tnvedCodeDAO;

    @Transactional
    public List<TnvedCode> listTnvedCodes() {
        return tnvedCodeDAO.listTnvedCodes();
    }

    @Transactional
    public TnvedCode getTnvedCodeById(Integer id) {
        return tnvedCodeDAO.getTnvedCodeById(id);
    }
}
