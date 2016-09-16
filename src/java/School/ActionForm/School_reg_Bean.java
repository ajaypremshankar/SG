/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package School.ActionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author ajay prem shankar
 */
public class School_reg_Bean extends org.apache.struts.action.ActionForm {
    private String school_name;
    private String board;
    private String registered_under;
    private String school_type;
    private String website;
    private String school_email;
    private String estb_year;
    private String school_phone;
    private String city;
    private String state;
    private String principal_name;
    private String principal_mob;
    private String principal_email;
    private String password;
    private String confirm_password;


    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

    /**
     * @return the school_name
     */
    public String getSchool_name() {
        return school_name;
    }

    /**
     * @param school_name the school_name to set
     */
    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    /**
     * @return the board
     */
    public String getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(String board) {
        this.board = board;
    }

    /**
     * @return the registered_under
     */
    public String getRegistered_under() {
        return registered_under;
    }

    /**
     * @param registered_under the registered_under to set
     */
    public void setRegistered_under(String registered_under) {
        this.registered_under = registered_under;
    }

    /**
     * @return the school_type
     */
    public String getSchool_type() {
        return school_type;
    }

    /**
     * @param school_type the school_type to set
     */
    public void setSchool_type(String school_type) {
        this.school_type = school_type;
    }

    /**
     * @return the website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website the website to set
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * @return the school_email
     */
    public String getSchool_email() {
        return school_email;
    }

    /**
     * @param school_email the school_email to set
     */
    public void setSchool_email(String school_email) {
        this.school_email = school_email;
    }

    /**
     * @return the estb_year
     */
    public String getEstb_year() {
        return estb_year;
    }

    /**
     * @param estb_year the estb_year to set
     */
    public void setEstb_year(String estb_year) {
        this.estb_year = estb_year;
    }

    /**
     * @return the school_phone
     */
    public String getSchool_phone() {
        return school_phone;
    }

    /**
     * @param school_phone the school_phone to set
     */
    public void setSchool_phone(String school_phone) {
        this.school_phone = school_phone;
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
     * @return the principal_name
     */
    public String getPrincipal_name() {
        return principal_name;
    }

    /**
     * @param principal_name the principal_name to set
     */
    public void setPrincipal_name(String principal_name) {
        this.principal_name = principal_name;
    }

    /**
     * @return the principal_mob
     */
    public String getPrincipal_mob() {
        return principal_mob;
    }

    /**
     * @param principal_mob the principal_mob to set
     */
    public void setPrincipal_mob(String principal_mob) {
        this.principal_mob = principal_mob;
    }

    /**
     * @return the principal_email
     */
    public String getPrincipal_email() {
        return principal_email;
    }

    /**
     * @param principal_email the principal_email to set
     */
    public void setPrincipal_email(String principal_email) {
        this.principal_email = principal_email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the confirm_password
     */
    public String getConfirm_password() {
        return confirm_password;
    }

    /**
     * @param confirm_password the confirm_password to set
     */
    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }
}
