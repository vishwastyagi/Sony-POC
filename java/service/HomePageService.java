/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.HomePageDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vishwas
 */
@Service("HomePageService")
public class HomePageService {
    @Autowired 
    HomePageDao homePageDao;
    public List getHomePage()
    {
        return homePageDao.getHomePage();
        
    }
    
}
