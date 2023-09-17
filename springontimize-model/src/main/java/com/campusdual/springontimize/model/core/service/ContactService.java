package com.campusdual.springontimize.model.core.service;

import com.campusdual.springontimize.api.core.service.IContactService;
import com.campusdual.springontimize.model.core.dao.ContactDAO;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Lazy
@Service("ContactService")
public class ContactService implements IContactService {
    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;
    @Autowired
    private ContactDAO contactDAO;
    @Override
    public EntityResult contactQuery(Map<String, Object> keyMap, List<String> attrList) {
        return this.daoHelper.query(this.contactDAO, keyMap, attrList);
    }

    @Override
    public EntityResult contactInsert(Map<String, Object> attrMap) {
        return this.daoHelper.insert(this.contactDAO, attrMap);
    }

    @Override
    public EntityResult contactUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) {
        return this.daoHelper.update(this.contactDAO, attrMap, keyMap);
    }

    @Override
    public EntityResult contactDelete(Map<String, Object> keyMap) {
        return this.daoHelper.delete(this.contactDAO, keyMap);
    }
}
