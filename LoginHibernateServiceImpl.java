package com.uhcl.com.uhcl.Service;

import com.uhcl.Dao.LoginHibernateDao;
import com.uhcl.model.LoginClass;
import com.uhcl.model.LoginHibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginHibernateServiceImpl implements LoginHibernateService{

    @Autowired
    private LoginHibernateDao loginHibernateDao;

    @Transactional
    public LoginHibernate findEmployeeById(LoginClass loginClass) {

        return loginHibernateDao.findEmployeeById(loginClass);
    }
}
