package garg.digaant.StudentTestSpring.Repository.Map;

import garg.digaant.StudentTestSpring.Model.Exam;
import garg.digaant.StudentTestSpring.Model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentMapServiceTest {

    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();
    Student student4 = new Student();
    Student student5 = new Student();
    Exam test1 = new Exam();
    Exam test2 = new Exam();
    Exam test3 = new Exam();
    Exam test4 = new Exam();
    Exam test5 = new Exam();
    Exam test6 = new Exam();
    Exam test7 = new Exam();
    Exam test8 = new Exam();
    Exam test9 = new Exam();
    Exam test10 = new Exam();

    StudentMapService studentMapService;

    @BeforeEach
    public void setUp(){
        studentMapService = new StudentMapService();
        test1.setId(1L);
        test1.setCourseName("Geography");
        test1.setMarks("A");

        test2.setId(2L);
        test2.setMarks("B");
        test2.setCourseName("Maths");

        Set<Exam> tests = new HashSet<>();

        tests.add(test1);
        tests.add(test2);
        student1.setTests(tests);
        tests = new HashSet<>();

        student1.setAge(19);
        student1.setName("Abhimanyu Singh");
        student1.setId(1L);

        test3.setId(3L);
        test3.setCourseName("Geography");
        test3.setMarks("B");

        test4.setId(4L);
        test4.setMarks("A");
        test4.setCourseName("Maths");

        tests.add(test3);
        tests.add(test4);
        student2.setTests(tests);
        tests = new HashSet<>();

        student2.setAge(19);
        student2.setName("Kirat Alang");
        student2.setId(2L);

        test5.setId(5L);
        test5.setCourseName("Geography");
        test5.setMarks("A");

        test6.setId(6L);
        test6.setMarks("B");
        test6.setCourseName("Maths");

        tests.add(test5);
        tests.add(test6);
        student3.setTests(tests);
        tests = new HashSet<>();

        student3.setAge(19);
        student3.setName("Ananya Sharma");
        student3.setId(3L);

        test7.setId(7L);
        test7.setCourseName("Geography");
        test7.setMarks("A");

        test8.setId(8L);
        test8.setMarks("A");
        test8.setCourseName("Maths");

        tests.add(test7);
        tests.add(test8);
        student4.setTests(tests);
        tests = new HashSet<>();

        student4.setAge(19);
        student4.setName("Neel Nagansure");
        student4.setId(4L);

        test9.setId(9L);
        test9.setCourseName("Geography");
        test9.setMarks("C");

        test10.setId(10L);
        test10.setMarks("C");
        test10.setCourseName("Maths");

        tests.add(test9);
        tests.add(test10);
        student5.setTests(tests);

    }

    @Test
    void findAll() {
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        studentMapService.save(student1);
        studentMapService.save(student2);
        studentMapService.save(student3);
        studentMapService.save(student4);
        studentMapService.save(student5);

        assertEquals(students,studentMapService.findAll());

    }

    @Test
    void findById() {
        studentMapService.save(student1);
        assertEquals(student1,studentMapService.findById(1L));
    }

    @Test
    void save() {

        assertEquals(student2,studentMapService.save(student2));
    }

    @Test
    void delete() {

    }

    @Test
    void deleteById() {
    }

    @Test
    void getAllTopStudents() {
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student3);
        students.add(student4);

        Set<Student> students1 = new HashSet<>();
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students1.add(student5);

        studentMapService.save(student1);
        studentMapService.save(student2);
        studentMapService.save(student3);
        studentMapService.save(student4);
        studentMapService.save(student5);

        assertEquals(students, studentMapService.getAllTopStudents(students1, "Geography"));
    }
}