/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.TVDetailsBean;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.HomePageService;

/**
 *
 * @author vishwas
 */
@Controller
public class HomePageController {
    @Autowired
    HomePageService homePageService;
    
    
    @RequestMapping(value="/home")
    public String getHomePage(HttpServletRequest req)
    {
        List<TVDetailsBean> l=homePageService.getHomePage();
        System.out.println("\n\n\nInside Home Page Controller  l=\n\n\n\n"+l);
        if(l.isEmpty())
            return "failure";
        else
        {
            req.getServletContext().setAttribute("myList", l);
            
            return "home";
        }
    }
}
