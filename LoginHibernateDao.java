package com.uhcl.Dao;

import com.uhcl.model.LoginClass;
import com.uhcl.model.LoginHibernate;

public interface LoginHibernateDao {

    LoginHibernate findEmployeeById(LoginClass loginClass);
}
