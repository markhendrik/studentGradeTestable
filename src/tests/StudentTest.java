package tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import persona.Student;
import testable.TestableGradeSheet;
import testable.TestableStudent;


public class StudentTest {

    @Test
    public void averageGradeCalculated() {
        Student student = new TestableStudent();
        student.setSheet(new TestableGradeSheet());

        Double average = student.getAverageGradeBetween(null, null);

        assertThat(average, is(3.5));
    }
}
