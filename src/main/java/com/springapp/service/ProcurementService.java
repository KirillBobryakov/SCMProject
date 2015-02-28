package com.springapp.service;

import com.springapp.domain.Procurement;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface ProcurementService {

    public void addProcurement(Procurement procurement);

    public List<Procurement> listProcurements();

    public void removeProcurement(Integer id);

    public Procurement getProcurementById(Integer id);
}
