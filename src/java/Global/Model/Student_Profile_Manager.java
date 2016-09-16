/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Global.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ajay prem shankar
 */
public class Student_Profile_Manager implements Serializable{
    private ProfileInfoBundle pib;
    private ArrayList<String> add_email;
    private ArrayList<String> subjects;
    private ArrayList<String> hobbies;
    private String career;

    /**
     * @return the pib
     */
    public ProfileInfoBundle getPib() {
        return pib;
    }

    /**
     * @param pib the pib to set
     */
    public void setPib(ProfileInfoBundle pib) {
        this.pib = pib;
    }

    /**
     * @return the add_email
     */
    public ArrayList<String> getAdd_email() {
        return add_email;
    }

    /**
     * @param add_email the add_email to set
     */
    public void setAdd_email(ArrayList<String> add_email) {
        this.add_email = add_email;
    }

    /**
     * @return the subjects
     */
    public ArrayList<String> getSubjects() {
        return subjects;
    }

    /**
     * @param subjects the subjects to set
     */
    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    /**
     * @return the hobbies
     */
    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * @return the career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(String career) {
        this.career = career;
    }
    
}
