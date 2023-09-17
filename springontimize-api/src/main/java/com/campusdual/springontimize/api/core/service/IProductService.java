package com.campusdual.springontimize.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import org.springframework.context.annotation.Lazy;

import java.util.List;
import java.util.Map;


public interface IProductService {
    public EntityResult productQuery(Map<String, Object> keyMap, List<String> attrList);
    public EntityResult productInsert(Map<String, Object> attrMap);
    public EntityResult productUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap);
    public EntityResult productDelete(Map<String, Object> keyMap);
}
