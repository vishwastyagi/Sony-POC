/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import com.sun.msv.reader.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author vishwas
 */
@Controller
public class ForwardController {
    @RequestMapping(value="/Register.htm")
    public String forward()
    {
        return "Register";
    }
}
