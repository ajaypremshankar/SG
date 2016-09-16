/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Global.Model;

/**
 *
 * @author ajay prem shankar
 */
public class Student_Info {
private String std;
private String section;
private String about;
private String parent_id;

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
}
