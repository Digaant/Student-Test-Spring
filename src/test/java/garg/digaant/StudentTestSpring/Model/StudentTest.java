package garg.digaant.StudentTestSpring.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    Student student;

    @BeforeEach
    public void setUp(){
        student = new Student();
    }

    @Test
    void getId() throws Exception{
        Long idValue = 4L;
        student.setId(idValue);
        assertEquals(idValue, student.getId());
    }

    @Test
    void getName() throws Exception{
        String nameValue = "John Wick";
        student.setName(nameValue);
        assertEquals(nameValue, student.getName());
    }

    @Test
    void getAge() throws Exception{
        int ageValue = 19;
        student.setAge(ageValue);
        assertEquals(ageValue, student.getAge());
    }

    @Test
    void getTests() throws Exception{
        Set<Exam> exams = new HashSet<>();
        Exam exam1 = new Exam();
        exam1.setId(1L);
        exam1.setCourseName("Maths");
        exam1.setMarks("A");
        exams.add(exam1);

        Exam exam2 = new Exam();
        exam2.setId(2L);
        exam2.setMarks("B");
        exam2.setCourseName("Geography");
        exams.add(exam2);

        student.setTests(exams);
        assertEquals(exams,student.getTests());
    }

}