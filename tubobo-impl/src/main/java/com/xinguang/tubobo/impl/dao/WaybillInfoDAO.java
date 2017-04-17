package com.xinguang.tubobo.impl.dao;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xinguang.tubobo.impl.entity.WaybillInfoEntity;

@Repository
public class WaybillInfoDAO extends BasicDAO<WaybillInfoEntity, String> {

    @Autowired
    protected WaybillInfoDAO(Datastore ds) {
        super(ds);
    }
	
}
