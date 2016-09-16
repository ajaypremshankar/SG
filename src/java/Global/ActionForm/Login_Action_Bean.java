/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Global.ActionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author ajay prem shankar
 */
public class Login_Action_Bean extends org.apache.struts.action.ActionForm {

    private String email;
    private String password;
    private boolean remember_me;



    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the remember_me
     */
    public boolean  getRemember_me() {
        return remember_me;
    }

    /**
     * @param remember_me the remember_me to set
     */
    public void setRemember_me(boolean remember_me) {
        this.remember_me = remember_me;
    }
}
