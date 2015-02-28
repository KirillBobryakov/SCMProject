package com.springapp.dao;

import com.springapp.domain.ProcurementGood;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface ProcurementGoodDAO {

    public void addProcurementGood(ProcurementGood procurementGood);

    public List<ProcurementGood> listProcurementGoods();

    public void removeProcurementGood(Integer id);

    public ProcurementGood getProcurementGoodById(Integer id);

    public List<ProcurementGood> listProcurementGoods(Integer procurementId);

}
