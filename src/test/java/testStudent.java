

import io.zipcoder.interfaces.Person;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;


public class testStudent {
    @Test
    public void testImplementation() {
        student student = new student(1, "Nastya");
        assertTrue(student instanceof learner);

//        //given
//        learner learner = new student(1, "Nastya");
//        //when
//        boolean result = learner instanceof learner;
//        //then
//        assertTrue(result);
    }

    @Test
    public void testInheritance() {
//        student student = new student(1, "Nastya");
//        assertTrue(student instanceof Person);


        Person person = new student(1, "Nastya");
        boolean result = person instanceof Person;
        assertTrue(result);

    }

    @Test
    public void testLearner() {
        student student = new student(1, "Nastya");
        // The expected value is 5.0, the actual value is student.getTotalStudyTime(),
        // and 0.0001 is the tolerance (or delta) allowed in the comparison.
        // This means that the test will consider the values equal if the difference
        // between the expected and actual values is within 0.0001.
        student.learn(5.0);
        assertEquals(5.0, student.getTotalStudyTime(), 0.0001);
//        //given
//        student student = new student();
//        boolean prelStudyTime = student.getTotalStudyTime();
//        boolean numberOfHoursStudy = student.getTotalStudyTime();
//        boolean postlStudyTime = student.getTotalStudyTime();
//
//        //when
//        student.learn(numberOfHoursStudy);
//        //then
//        assertEquals(numberOfHoursStudy, student.getTotalStudyTime(), 0.0001);

    }
}
