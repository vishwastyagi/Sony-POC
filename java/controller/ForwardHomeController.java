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
 * @author VT108366
 */
@Controller
public class ForwardHomeController {

    @RequestMapping(value = "/homeClicked")
    public String homeClicked(HttpServletRequest req) {


        if (req.getSession().getAttribute("username") == null) {
            return "home";
        } else {
            String role = (String) req.getSession().getAttribute("role");
            if (role.equals("admin")) {
                return "adminhome";
            } else {
                return "home";
            }

        }
    }
}
