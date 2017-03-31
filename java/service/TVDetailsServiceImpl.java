/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;



import dao.TVDetailsDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author VT108366
 */
@Service("TVDetailsService")
public class TVDetailsServiceImpl {
    @Autowired
         
    TVDetailsDao tvdetailsdao;
    public List getDetails(String modelname)
    {
        return tvdetailsdao.getDetails(modelname);
    }
    
}
