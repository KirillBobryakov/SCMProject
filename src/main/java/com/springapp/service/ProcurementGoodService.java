package com.springapp.service;

import com.springapp.domain.Procurement;
import com.springapp.domain.ProcurementGood;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface ProcurementGoodService {

    public void addProcurementGood(ProcurementGood procurementGood);

    public List<ProcurementGood> listProcurementGoods();

    public void removeProcurementGood(Integer id);

    public ProcurementGood getProcurementGoodById(Integer id);

    public List<ProcurementGood> listProcurementGood(Integer procurementId);
}
