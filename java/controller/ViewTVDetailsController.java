/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;



import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.TVDetailsServiceImpl;



/**
 *
 * @author VT108366
 */
@Controller
public class ViewTVDetailsController {
   
    List<bean.TVDetailsBean> l=null;
    
    @Autowired         
    TVDetailsServiceImpl tvdetailsService;

    public void setLoginService(TVDetailsServiceImpl tvdetailsService) {
        this.tvdetailsService = tvdetailsService;
    }
    
    
    @RequestMapping(value="/ViewTVDetails.htm")
    public String getDetails(@RequestParam("modelname") String modelname,HttpServletRequest req)
    {
        System.out.println("\n\n\n\nViewTVDetails Controller   modelname="+modelname+"\n\n\n\n\n\n");
        
        l=tvdetailsService.getDetails(modelname);
        
         System.out.println("\n\n\n In ViewTVDetails Controller  controller l= "+l+"\n\n\n");
         System.out.println("model name= "+l.get(0).getModelname());
         req.getSession().setAttribute("myList", l);
         //req.setAttribute("myList", l);
        return "ViewTVDetails";
    }
    
   
   
    

}
