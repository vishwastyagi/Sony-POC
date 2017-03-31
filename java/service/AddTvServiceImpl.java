/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TVDetailsBean;
import dao.AddTvDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vishwas
 */
@Service("AddTvService")
public class AddTvServiceImpl {
    @Autowired 
    AddTvDaoImpl addTvDaoImpl;
    
    public String addRecord(TVDetailsBean tvDetailsBean)
    {
        return addTvDaoImpl.addRecord(tvDetailsBean);
    }
    
}
