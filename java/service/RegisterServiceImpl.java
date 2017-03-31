/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.RegisterBean;
import dao.RegisterDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vishwas
 */
@Service("RegisterService")
public class RegisterServiceImpl {
    @Autowired
    RegisterDaoImpl registerDao;
    
    public String registerDao(RegisterBean registerBean)
    {
        return registerDao.registerUser(registerBean);
    }
}
