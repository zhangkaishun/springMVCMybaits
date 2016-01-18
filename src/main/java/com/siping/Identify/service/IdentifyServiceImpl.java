package com.siping.Identify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siping.Identify.bean.Identify;
import com.siping.Identify.dao.IdentifyDao;
@Service
public class IdentifyServiceImpl implements IdentifyService {

    @Autowired
    private IdentifyDao identifyDao;
    public Identify getIdentifyByUserid(int userId) {
       Identify identify=identifyDao.getIdentifyByUserId(userId);
        return identify;
        
    }
    
}
