package se.innovationlab.coursemanager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
    value= {CourseTests.class,
            StudentTests.class}
)
/**
 *
 * @author erikskoglund
 */
public class CourseManagerSuite {   
}