/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.TVDetailsBean;
import java.io.File;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import service.AddTvServiceImpl;

/**
 *
 * @author vishwas
 */
@Controller
public class AddTVController {
    @Autowired
    AddTvServiceImpl addTvService;

    @RequestMapping("/addtvform")
    public String addTvForward(@ModelAttribute("addTvForm") TVDetailsBean tvDetailsBean,HttpServletRequest req) {
        System.out.println("\n\nInside Add Tv Controller\n");
        System.out.println(""+tvDetailsBean.getHighdefination());
        System.out.println(""+tvDetailsBean.getModelname());
        
        MultipartFile file = tvDetailsBean.getFile();
        System.out.println("\n\n\nInside FileUpload Controller\n\n");
        
        if (file != null) {
            System.out.println("\n\nInside if\n\n");
            
            System.out.println("original name= " + file.getOriginalFilename());
            try {
                file.transferTo(new File("D:\\java programs\\online jobportal\\temp2\\web\\images\\" + file.getOriginalFilename()));
                //System.out.println(new File("D:\\java programs\\online jobportal\\temp2\\web\\images\\" + file.getOriginalFilename()).toString());
                tvDetailsBean.setImagelocation(new File("images\\" + file.getOriginalFilename()).toString());
                String s=addTvService.addRecord(tvDetailsBean);
                if(s.equalsIgnoreCase("success"))
                {
                    req.setAttribute("msg", "data uploaded");
                }
                else
                {
                    req.setAttribute("msg", "data not uploaded due to some error! Try latter");
                }
                // return "adminhome";
               
            } catch (Exception e) {
                System.out.println("Exception in uploading file: " + e);
                //return "failure";
            }
        } else {
             req.setAttribute("msg", "data not properly filled try again ");
        }
        return "adminhome";
    }
}

