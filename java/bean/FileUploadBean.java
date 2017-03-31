/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author vishwas
 */
public class FileUploadBean {
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
    
    
}
