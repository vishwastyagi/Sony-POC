/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


import bean.*;
import java.io.Serializable;
import org.springframework.web.multipart.MultipartFile;


/**
 *
 * @author VT108366
 */


public class TVDetailsBean implements Serializable {
    private String modelname;
    private String screentype;
    private String threedsupport;
    private double tvsize;
    private String highdefination;
    private double price;
    private MultipartFile file;
    private String imagelocation;

    
    
    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

  
    public String getScreentype() {
        return screentype;
    }

    public void setScreentype(String screentype) {
        this.screentype = screentype;
    }

    
    public String getThreedsupport() {
        return threedsupport;
    }

    public void setThreedsupport(String threedsupport) {
        this.threedsupport = threedsupport;
    }

    
    public double getTvsize() {
        return tvsize;
    }

    public void setTvsize(double tvsize) {
        this.tvsize = tvsize;
    }

 
    public String getHighdefination() {
        return highdefination;
    }

    public void setHighdefination(String highdefination) {
        this.highdefination = highdefination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getImagelocation() {
        return imagelocation;
    }

    public void setImagelocation(String imagelocation) {
        this.imagelocation = imagelocation;
    }

    
    
    
}
