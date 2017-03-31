package service;


import dao.LoginDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.LoginBean;
import dao.LoginDaoIntr;
import exception.PasswordDoesNotMatchException;
import exception.UserNameDoesNotExistException;
import java.util.List;


@Service("LoginService")
public class LoginServiceImpl {

	@Autowired
	LoginDaoImpl logindao;
	
	
	public List validate(LoginBean loginBean)  {
		return logindao.validate(loginBean);
		
	}

	
}
