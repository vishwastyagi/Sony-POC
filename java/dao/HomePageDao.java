/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.TVDetailsBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vishwas
 */
@Repository
public class HomePageDao {
    @Autowired
    HibernateTemplate ht;
    
    public List getHomePage()
    {
        List<TVDetailsBean>l=ht.loadAll(TVDetailsBean.class);
        return l;
        
    }
    
}
