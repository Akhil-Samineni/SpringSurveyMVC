package com.uhcl.com.uhcl.Service;

import com.uhcl.model.LoginClass;
import com.uhcl.model.LoginHibernate;
import org.springframework.stereotype.Service;

public interface LoginHibernateService {

    LoginHibernate findEmployeeById(LoginClass loginClass);
}
