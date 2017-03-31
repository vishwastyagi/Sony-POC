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
public class SignInController {
    @RequestMapping(value="/login")
    public String login(HttpServletRequest req)
    {
        if(req.getSession().getAttribute("username")==null)
        {
            return "login";
        }
        else
        {
            req.getSession().setAttribute("msg", "You have already signed in");
            if(req.getSession().getAttribute("redirectTo")==null)
                return "home";
            else 
                return (String)req.getSession().getAttribute("redirectTo");
        }
    }
    
}
