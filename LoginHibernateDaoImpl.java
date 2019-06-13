package com.uhcl.Dao;


import com.uhcl.model.LoginClass;
import com.uhcl.model.LoginHibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class LoginHibernateDaoImpl implements  LoginHibernateDao {

    @Autowired
    private SessionFactory sessionFactory;



    public LoginHibernate findEmployeeById(LoginClass loginClass) {
        System.out.println("In login hibernate method....");
        LoginHibernate loginHibernate=sessionFactory.getCurrentSession().get(LoginHibernate.class,loginClass.getUsername());
        if(loginHibernate !=null) {
            System.out.println("Details are " + loginHibernate.getGroupName() + " " + loginHibernate.getUserName() + " " + loginHibernate.getPass());
        }
        return loginHibernate;
    }

}
