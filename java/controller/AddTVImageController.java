/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.FileUploadBean;
import java.io.File;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author vishwas
 */
@Controller
public class AddTVImageController {
    @RequestMapping(value="/fileuploadcontroller")
    public String addImage(@ModelAttribute("fileupload") FileUploadBean fileUpload) 
            
    {
        MultipartFile file=fileUpload.getFile();
        System.out.println("\n\n\nInside FileUpload Controller\n\n");
        if(file!=null)
        {
            System.out.println("original name= "+file.getOriginalFilename());
            try{
                file.transferTo(new File("D:\\java programs\\online jobportal\\temp2\\web\\images\\"+file.getOriginalFilename()));
                return "success";
            }
            catch(Exception e)
            {
                System.out.println("Exception in uploading file: "+e);
                return "failure";
            }
        }
        else 
            return "failure";
    }
}
