/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Parent.ActionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author ajay prem shankar
 */
public class Parent_comp_reg_Bean extends org.apache.struts.action.ActionForm {

    private FormFile file;
    private String occupation;
    private String education;
    private String city;
    private String state;
    private String spouse_gender;
    private String spouse;
    private String about;

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
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the education
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education the education to set
     */
    public void setEducation(String education) {
        this.education = education;
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
     * @return the spouse_gender
     */
    public String getSpouse_gender() {
        return spouse_gender;
    }

    /**
     * @param spouse_gender the spouse_gender to set
     */
    public void setSpouse_gender(String spouse_gender) {
        this.spouse_gender = spouse_gender;
    }

    /**
     * @return the spouse
     */
    public String getSpouse() {
        return spouse;
    }

    /**
     * @param spouse the spouse to set
     */
    public void setSpouse(String spouse) {
        this.spouse =spouse;
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
}
