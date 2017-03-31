/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.TVDetailsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vishwas
 */
@Repository("AddImageDaoImpl")
public class AddTvDaoImpl {
    
    @Autowired
    HibernateTemplate ht;
    
    public String addRecord(TVDetailsBean tvDetailsBean)
    {
        try
        {
            ht.save(tvDetailsBean);
            return "success";
        }
        catch(Exception e)
        {
            return "failure";
        }
    }
    
    
}
