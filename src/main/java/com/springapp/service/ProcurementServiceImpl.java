package com.springapp.service;

import com.springapp.dao.CountryDAO;
import com.springapp.dao.ProcurementDAO;
import com.springapp.domain.Country;
import com.springapp.domain.Procurement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
@Service
public class ProcurementServiceImpl implements ProcurementService {

    @Autowired
    private ProcurementDAO procurementDAO;

    @Transactional
    public void addProcurement(Procurement procurement) {
        if(procurementDAO.getProcurementById(procurement.getId()) != null) {
            procurementDAO.updateProcurement(procurement);
        } else {
            procurementDAO.addProcurement(procurement);
        }
    }

    @Transactional
    public List<Procurement> listProcurements() {
        return procurementDAO.listProcurements();
    }

    @Transactional
    public void removeProcurement(Integer id) {
        procurementDAO.removeProcurement(id);
    }

    @Transactional
    public Procurement getProcurementById(Integer id){
        return procurementDAO.getProcurementById(id);
    }
}
