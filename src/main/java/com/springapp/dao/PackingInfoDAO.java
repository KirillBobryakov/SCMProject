package com.springapp.dao;

import com.springapp.domain.PackingInfo;
import com.springapp.domain.TnvedCode;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface PackingInfoDAO {


    public List<PackingInfo> listPackingInfo();

    public PackingInfo getPackingInfoById(Integer id);

}
