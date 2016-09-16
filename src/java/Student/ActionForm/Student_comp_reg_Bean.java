/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Student.ActionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author ajay prem shankar
 */
public class Student_comp_reg_Bean extends org.apache.struts.action.ActionForm {

    private FormFile file;
    private String std;
    private String section;
    private String parent_id;
    private String city;
    private String state;
    private String about;
    private String hobby;
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

    /**
     * @return the file
     */
    public FormFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(FormFile file) {
        this.file = file;
    }

    /**
     * @return the std
     */
    public String getStd() {
        return std;
    }

    /**
     * @param std the std to set
     */
    public void setStd(String std) {
        this.std = std;
    }

    /**
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return the parent_id
     */
    public String getParent_id() {
        return parent_id;
    }

    /**
     * @param parent_id the parent_id to set
     */
    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the about
     */
    public String getAbout() {
        return about;
    }

    /**
     * @param about the about to set
     */
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * @return the hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * @param hobby the hobby to set
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
