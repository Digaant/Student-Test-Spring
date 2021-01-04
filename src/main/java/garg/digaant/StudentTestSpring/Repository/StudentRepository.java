package garg.digaant.StudentTestSpring.Repository;

import garg.digaant.StudentTestSpring.Model.Student;

import java.util.Set;

public interface StudentRepository extends CrudService<Student, Long> {

    Set<Student> getAllTopStudents(Set<Student> students, String test);
}
