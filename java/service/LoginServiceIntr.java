/**
 * 
 */
package service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bean.LoginBean;
import exception.PasswordDoesNotMatchException;
import exception.UserNameDoesNotExistException;
/**
 * @author vishwas
 * 
 *
 */
@Service("LoginService")
public interface LoginServiceIntr {
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public String validate(LoginBean loginModel) ;
 }
