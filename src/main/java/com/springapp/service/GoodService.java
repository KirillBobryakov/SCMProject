package com.springapp.service;

import com.springapp.domain.Good;
import com.springapp.domain.PackingInfo;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
public interface GoodService {

    public List<Good> listGoods();

    public Good getGoodById(Integer id);

}
