package com.springapp.service;

import com.springapp.dao.ProcurementDAO;
import com.springapp.dao.ProcurementGoodDAO;
import com.springapp.domain.Procurement;
import com.springapp.domain.ProcurementGood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
@Service
public class ProcurementGoodServiceImpl implements ProcurementGoodService {

    @Autowired
    private ProcurementGoodDAO procurementGoodDAO;

    @Transactional
    public void addProcurementGood(ProcurementGood procurementGood) {
        procurementGoodDAO.addProcurementGood(procurementGood);

    }

    @Transactional
    public List<ProcurementGood> listProcurementGoods() {
        return procurementGoodDAO.listProcurementGoods();
    }

    @Transactional
    public void removeProcurementGood(Integer id) {
        procurementGoodDAO.removeProcurementGood(id);
    }

    @Transactional
    public ProcurementGood getProcurementGoodById(Integer id){
        return procurementGoodDAO.getProcurementGoodById(id);
    }

    @Transactional
    public List<ProcurementGood> listProcurementGood(Integer procurementId) {
        return procurementGoodDAO.listProcurementGoods(procurementId);
    }
}
