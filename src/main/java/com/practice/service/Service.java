package com.practice.service;

import com.practice.dao.EntityDao;
import com.practice.entity.Info;
import com.practice.enums.DaoType;
import com.practice.factory.DaoFactory;
import org.apache.log4j.Logger;

public class Service {
    private static final Logger LOG = Logger.getLogger(Service.class);
    private final EntityDao<Info> infoDao;

    public Service() {
        this.infoDao = DaoFactory.getEntityDao(DaoType.INFO);
    }

    public String getDestinations(){
        return infoDao.getById(1).getDestinations();
    }

    public String getLastMinuteOne(){
        return infoDao.getById(1).getLastMinuteOne();
    }

    public String getLastMinuteTwo(){
        return infoDao.getById(1).getGetLastMinuteTwo();
    }
}
