package dao;

import bean.LoginBean;
import exception.PasswordDoesNotMatchException;
import exception.UserNameDoesNotExistException;
import java.util.List;

public interface LoginDaoIntr {
	public List validate(LoginBean loginBean);

}
