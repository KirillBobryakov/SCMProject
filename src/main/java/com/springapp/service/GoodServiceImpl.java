package com.springapp.service;

import com.springapp.dao.GoodDAO;
import com.springapp.dao.PackingInfoDAO;
import com.springapp.domain.Good;
import com.springapp.domain.PackingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bkv on 17/02/15.
 */
@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    private GoodDAO goodDAO;

    @Transactional
    public List<Good> listGoods() {
        return goodDAO.listGoods();
    }

    @Transactional
    public Good getGoodById(Integer id) {
        return goodDAO.getGoodById(id);
    }
}
