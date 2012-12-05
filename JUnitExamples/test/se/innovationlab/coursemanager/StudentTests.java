package se.innovationlab.coursemanager;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author erikskoglund
 */
public class StudentTests {
    
    Student student;
    
    public StudentTests() {
    }
    
    @Before
    public void setUp(){
        student = new Student("Pelle");
        student.setEmail("example@example.com");
    }
    
    @Test
    public void testStudentShouldHaveAName(){
        assertFalse("Student name should not be empty", student.getName().equals(""));
    }
    
    @Test
    public void testStudentNameShouldNotBeNull(){
        student = new Student(null);
        assertFalse("Student name should not be null", student.getName() == null);
    }
    
    @Test
    public void testStudentShouldHaveAValidEmailAddress(){
        assertTrue("Student should have a valid email address", student.getEmail().matches("[a-öA-Ö0-9 .]*@[a-öA-Ö0-9 .]*.[a-öA-Ö0-9 .]*"));
    }
}
