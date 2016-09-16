/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Global.Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ajay prem shankar
 */
public class ObjectSerializer {
    
    public static int PROFILE=1;
    
    
    
    
    /**
     *
     * @param obj
     * @param id
     * @param Object_type
     * @return
     */
    
    //Object_type is future aspect to manage diffrent persistant
    //objects in user folder till now it is only profileObject
    
    public static boolean Writer(Object obj, String id, int object_type, String root){
    
        
        File path=new File(root+"userData/"+id);
        File file=new File(path,"profileObject.SG");
        try {
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(obj);
            System.out.println("File Written");
            oos.flush();
            oos.close();
            
        } catch (Exception ex) {
            System.out.println("Errror Occurred"+ex);
            return false;
        }
        return true;
    }
    
    
    /**
     *
     * @param id
     * @param object_type
     * @return
     */
    public static Object Reader(String id, int object_type, String root){
        
        Object obj = null;
        File path=new File(root+"userData/"+id);
        File file=new File(path,"profileObject.SG");
        try{
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        obj=ois.readObject();
        ois.close();
        }catch(Exception e){
        return obj;
        }
        return obj;
    }
 
    public static Object Updater(Object obj,String field, String id, int object_type){
        
        
        return obj;
    
    
    }
    
    
}
