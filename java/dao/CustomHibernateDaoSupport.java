package dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.SessionFactory;

public class CustomHibernateDaoSupport extends HibernateDaoSupport {
	public void setCustomSessionFactory(SessionFactory sf)
	{
		setSessionFactory(sf);
	}

}
