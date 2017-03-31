/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author vishwas
 */
@Controller
public class LogoutController {
    
    @RequestMapping(value="/logout")
    public String logout(HttpServletRequest req)
    {
        System.out.println("LogoutController called");
        String s=(String)req.getSession().getAttribute("redirectTo");
        if(req.getSession().getAttribute("username")!=null)
        {
            req.getSession().invalidate();
            req.setAttribute("msg", "You are Logout");
            return "home";
        }
        else
        {
            req.setAttribute("msg","No User exist");
            //String s=(String)req.getSession().getAttribute("redirectTo");
            if(s==null)
                return "home";
            else
                return s;
        }
        
        
    }
    
}
