/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.LoginBean;
import bean.RegisterBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vishwas
 */
@Repository("RegisterDao")
public class RegisterDaoImpl {
    
    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    
    
    
    
    public String registerUser(RegisterBean bean)
    {
        System.out.println("\n\nResitration dao impl next two row are id\n\n");
        System.out.println(hibernateTemplate.save(bean));
        LoginBean loginBean=new LoginBean();
        loginBean.setPassword(bean.getPassword());
        loginBean.setRole(bean.getRole());
        loginBean.setUsername(bean.getUsername());
        System.out.println(hibernateTemplate.save(loginBean));
      
        return "success";
        
    }
    
}
