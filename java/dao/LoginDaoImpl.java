package dao;

import java.util.List;



import bean.LoginBean;
import exception.PasswordDoesNotMatchException;
import exception.UserNameDoesNotExistException;
import java.text.MessageFormat;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import org.springframework.stereotype.Repository;


@Repository("LoginDao")
public class LoginDaoImpl implements LoginDaoIntr{

	@Autowired
	HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate ht)
	{
		hibernateTemplate=ht;
	}
	
	
	public List validate(LoginBean loginBean) 
	{
         
            System.out.println("\n\nInside Login dao imple\n\n\n");
		Session session=hibernateTemplate.getSessionFactory().openSession();
                Transaction t=session.beginTransaction();
                Criteria criteria=session.createCriteria(LoginBean.class);
                System.out.println(MessageFormat.format("username= {0} password= {1}", loginBean.getUsername(), loginBean.getPassword()));
                criteria.add(Restrictions.eq("username", loginBean.getUsername().trim()));
                criteria.add(Restrictions.eq("password", loginBean.getPassword().trim()));
                
                t.commit();
                List l=criteria.list();
                
               session.close();
                System.out.println(MessageFormat.format("\n\nl=={0}\n\n\n", l));
               
                    return l;
                
                
        }
	

}
