/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author vishwas
 */
@Controller
public class ForwardToAddTv {
     @RequestMapping("/addtv")
    public String addTvForward()
    {
        return "addTv";
    }
    
}
