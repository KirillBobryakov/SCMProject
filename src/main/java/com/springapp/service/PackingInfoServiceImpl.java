package com.springapp.service;

import com.springapp.dao.PackingInfoDAO;
import com.springapp.dao.TnvedCodeDAO;
import com.springapp.domain.PackingInfo;
import com.springapp.domain.TnvedCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
@Service
public class PackingInfoServiceImpl implements PackingInfoService {

    @Autowired
    private PackingInfoDAO packingInfoDAO;

    @Transactional
    public List<PackingInfo> listPackingInfo() {
        return packingInfoDAO.listPackingInfo();
    }

    @Transactional
    public PackingInfo getPackingInfoById(Integer id) {
        return packingInfoDAO.getPackingInfoById(id);
    }
}
