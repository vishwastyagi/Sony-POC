/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.TVDetailsBean;
import dao.LoginDaoImpl;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import service.LoginServiceImpl;

/**
 *
 * @author VT108366
 */
@Controller

public class BuyController {
    
    
    @RequestMapping(value="/buy")
    public String buy(@ModelAttribute("buytv") TVDetailsBean tvdetailsBean,HttpServletRequest req )
    {
        System.out.println("\n\nInside Buy Controller\n\n\n");
        req.getSession().setAttribute("selectedtvdetails",tvdetailsBean);
        req.getSession().setAttribute("redirectTo", "ViewTVDetails");
        if(req.getSession().getAttribute("username")==null)
        {
            req.getSession().setAttribute("buy", "clicked");
            System.out.println("UserName does not exist");
            return "login";
            
        }
        else
        {
            System.out.println("\n\n\nusername exist username= "+ req.getSession().getAttribute("username")+"\n\n\n");
            
            return "Payment";
        }
    }
    
}
