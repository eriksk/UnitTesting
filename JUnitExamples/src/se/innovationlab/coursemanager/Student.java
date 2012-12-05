package se.innovationlab.coursemanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erikskoglund
 */
public class Student {

    private String name;
    private String email;
    private List<String> courseRequirements;
    
    public Student(String name) {
        this.name = name;
        courseRequirements = new ArrayList<String>();
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCourseRequirements() {
        return courseRequirements;
    }
    
    public boolean hasCompleted(String courseRequirement){
        for(String cr : courseRequirements){
            if(cr.equals(courseRequirement)){
                return true;
            }
        }
        return false;
    }
}
