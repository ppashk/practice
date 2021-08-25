package com.practice.factory;

import com.practice.dao.EntityDao;
import com.practice.dao.InfoDao;
import com.practice.enums.DaoType;

import java.util.HashMap;
import java.util.Map;

public class DaoFactory {
    private static Map<DaoType, EntityDao> daoMap = new HashMap<>();

    static {
        daoMap.put(DaoType.INFO, new InfoDao());
    }

    private DaoFactory() {
    }

    public static EntityDao getEntityDao(DaoType daoType){
        EntityDao entityDao = daoMap.get(daoType);
        if(entityDao != null ){
            return entityDao;
        } throw new RuntimeException("Dao with current dao type do not exist: " + daoType.name());
    }
}
