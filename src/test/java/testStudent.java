

import io.zipcoder.interfaces.Person;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;


public class testStudent {
    @Test
    public void testImplementation() {
        student student = new student(1, "Nastya");
        assertTrue(student instanceof learner);
    }

    @Test
    public void testInheritance() {
        student student = new student(1, "Nastya");
        assertTrue(student instanceof Person);

    }

    @Test
    public void testLearner() {

    }
}
