/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;




//import bean1.TVDetailsBean;
import bean.TVDetailsBean;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author VT108366
 */
@Repository("TVDetailsDao")
public class TVDetailsDao {
        @Autowired
	HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate ht)
	{
		hibernateTemplate=ht;
	}
        
        
        
    public List getDetails(String modelname)
    {
        
        
        //DetachedCriteria query=DetachedCriteria.forClass(TVDetailsBean.class).add(Expression.eq("modelname", modelname));
	//@SuppressWarnings("unchecked")
	//hibernateTemplate.find("select * from tvdetails where modelname="+modelname);
        //List<TVDetailsBean> l=hibernateTemplate.findByCriteria(query);
       // modelname=modelname.replace('S', 's');
       // modelname=modelname.replace('M', 'm');
        //modelname=modelname.replace('X','x');
        
        TVDetailsBean t=hibernateTemplate.get(TVDetailsBean.class, modelname);
        List<TVDetailsBean> l=new ArrayList();
        l.add(t);
        System.out.println("\n\n\nl="+l+"\n\n\n");
        return l;
    }
    
}
