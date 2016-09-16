/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Global.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ajay prem shankar
 */
public class ProfileBundler {

    public static  String STUDENT="student";
    public static  String PARENT="parent";
    public static  String TEACHER="teacher";

private String QUERY="select * from ";

public static ProfileInfoBundle bundle(String id, String user_type){
    ProfileInfoBundle pib=new ProfileInfoBundle();

    ResultSet rs=DBOperation.getRecord("select * from user_basic where global_id='"+id+"';");
    pib.setId(id);
    pib.setUser_type(user_type);
            try {
                if (rs.next()) {
                    pib.setFname(rs.getString("fname"));
                    pib.setLname(rs.getString("lname"));
                    pib.setDob(rs.getString("dob"));
                    pib.setSex(rs.getString("sex"));
                    pib.setSchool(rs.getString("school_name"));
                    pib.setPic_path(rs.getString("pic"));
                    
                    pib.setCity(rs.getString("city"));
                    pib.setState(rs.getString("state"));
                    pib.setMob(rs.getString("mob"));
                    pib.setAddress(rs.getString("address"));
                    pib.setCountry(rs.getString("country"));
                }
                rs.close();
                //Type Specific Operations
                if(user_type.equals(STUDENT))
                {
                Student_Info si=new Student_Info();
                rs=DBOperation.getRecord("select * from student_info where global_id='"+id+"';");
                if(rs.next()){
                si.setStd(rs.getString("std"));
                si.setSection(rs.getString("section"));
                si.setAbout(rs.getString("about"));
                si.setParent_id(rs.getString("parent_id"));

                pib.setUser_specific(si);
                }
                rs.close();
                }

                else if(user_type.equals(PARENT))
                {
                Parent_Info pi=new Parent_Info();
                rs=DBOperation.getRecord("select * from parent_info where global_id='"+id+"';");
                if(rs.next()){
                pi.setEducation(rs.getString("education"));
                pi.setOccupation(rs.getString("occupation"));
                pi.setAbout(rs.getString("about"));
                pi.setSpouse(rs.getString("spouse"));
                pib.setUser_specific(pi);
                }
                rs.close();
                }

                else if(user_type.equals(TEACHER))
                {
                Teacher_Info ti=new Teacher_Info();
                rs=DBOperation.getRecord("select * from teacher_info where global_id='"+id+"';");
                if(rs.next()){
                ti.setEducation(rs.getString("education"));
                ti.setExperience(rs.getString("experience"));
                ti.setAbout(rs.getString("about"));

                
                ti.setSubjects(rs.getString("subjects"));
                pib.setUser_specific(ti);
                }
                rs.close();
                }




                return pib;
            } catch (SQLException ex) {
            return null;
    }
    }
}
