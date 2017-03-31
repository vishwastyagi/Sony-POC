/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.RegisterBean;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import service.RegisterServiceImpl;

/**
 *
 * @author vishwas
 */
@Controller
public class RegisterController {

    public RegisterController() {
        System.out.println("\n\n\nResister Controller called\n\n\n");
    }
    @Autowired
    RegisterServiceImpl registerService;

    @RequestMapping(value = "/registerform.htm")
    public String registerUser(@ModelAttribute("registerBean") RegisterBean register, BindingResult result, HttpServletRequest req) {
        System.out.println("\n\nInside Register Controller\n\n");
        if (req.getSession().getAttribute("username") != null) {
            String role = (String) req.getSession().getAttribute("role");
            if (role.equals("admin")) {
                register.setRole("admin");
                registerService.registerDao(register);
                req.setAttribute("msg", "Registration Done");
            } else {
                req.setAttribute("msg", "Already Registered");
                if (req.getSession().getAttribute("redirectTo") == null) {
                    return "home";
                } else {
                    return (String) req.getSession().getAttribute("redirectTo");
                }
            }
        } else {
            register.setRole("user");
            registerService.registerDao(register);
            req.getSession().setAttribute("username", register.getUsername());
            req.getSession().setAttribute("role", register.getRole());
            req.setAttribute("msg", "Registration Done");
        }



        if (req.getSession().getAttribute("redirectTo") == null) {
            return "home";
        } else {
            return (String) req.getSession().getAttribute("redirectTo");
        }


    }
}
