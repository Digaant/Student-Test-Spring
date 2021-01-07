package garg.digaant.StudentTestSpring.Repository.Map;

import garg.digaant.StudentTestSpring.Model.Student;
import garg.digaant.StudentTestSpring.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class StudentMapService extends AbstractMapService<Student , Long> implements StudentRepository {
    @Override
    public Set<Student> findAll() {
        return super.findALl();
    }

    @Override
    public Student findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Student save(Student object) {
        return super.save(object);
    }

    @Override
    public void delete(Student object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Student> getAllTopStudents(Set<Student> students, String test) {
        Set<Student> topStudents = new HashSet<>();
        if(!students.isEmpty()){
            students.forEach(student -> {
                if(!student.getTests().isEmpty()){
                    student.getTests().forEach(test1 -> {
                        if(test1.getCourseName().equals(test)){
                            if(test1.getMarks().equals("A")){
                                topStudents.add(student);
                            }
                        }
                    });
                }
                else{
                    System.out.println(" No Student has appeared for test");
                }
            });
        }
        return topStudents;
    }
}
