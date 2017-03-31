package controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bean.LoginBean;
//import exception.PasswordDoesNotMatchException;
//import exception.UserNameDoesNotExistException;
import org.springframework.validation.BindingResult;
import service.LoginServiceImpl;

//import service.LoginServiceImpl;
@Controller
public class LoginController {

    @Autowired
    LoginServiceImpl loginServiceImpl;

    @RequestMapping(value = "/loginform.htm")
    public String validateLogin(@ModelAttribute("login") LoginBean loginBean, BindingResult bindingresult, HttpServletRequest req) {

        System.out.println("\n\n\n\nInside LoginController   Validate method called\n\n\n\n");

        System.out.println("\n\n req.getServletPath()= " + req.getServletPath() + "    " + req.getRequestURL() + "\n\n");
        List l = loginServiceImpl.validate(loginBean);
        System.out.println("Inside LoginController  l=" + l);
        if (l.isEmpty()) {
            System.out.println("\n\nUser does not exist\n\n");
            req.setAttribute("msg", "No record found! Click on Register");
            return "login";
        } else {
            String url = (String) req.getSession().getAttribute("redirectTo");
            req.setAttribute("msg", "You are logged in");
            System.out.println("\n\n\nUser exist in db  and username=" + ((LoginBean) (l.get(0))).getUsername() + " and url= " + url);

            req.getSession().setAttribute("username", ((LoginBean) (l.get(0))).getUsername());
            req.getSession().setAttribute("role", ((LoginBean) (l.get(0))).getRole());
            if (url == null) {
                if(((LoginBean) (l.get(0))).getRole().equalsIgnoreCase("admin"))
                    return "adminhome";
                else
                    return "home";
            } else {
                return url;
            }
        }

    }
}
