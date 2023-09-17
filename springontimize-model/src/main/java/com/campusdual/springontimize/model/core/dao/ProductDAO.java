package com.campusdual.springontimize.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository(value="^ProductDAO")
@ConfigurationFile(
        configurationFile = "dao/ProductDAO.xml",
        configurationFilePlaceholder = "dao/placeholders.properties"
)
public class ProductDAO extends OntimizeJdbcDaoSupport {
    public static final String ATTR_ID = "ID";
    public static final String ATTR_NAME = "NAME";
    public static final String ATTR_STOCK = "STOCK";
    public static final String ATTR_PRICE = "PRICE";
    public static final String ATTR_ACTIVE = "ACTIVE";
    public static final String ATTR_DATE_ADDED = "DATE_ADDED";
}
