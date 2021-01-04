package garg.digaant.StudentTestSpring.Controller;


import garg.digaant.StudentTestSpring.Model.Student;
import garg.digaant.StudentTestSpring.Repository.Map.StudentMapService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/student-test")
public class StudentController {

    private StudentMapService studentMapService;

    public StudentController(StudentMapService studentMapService) {
        this.studentMapService = studentMapService;
    }

    @GetMapping("/students")
    public Set<Student> getAllStudents(){
        return studentMapService.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentMapService.findById(id);
    }

    @GetMapping("/students/{test}")
    public Set<Student> getAllTopStudents(@PathVariable String test){
        return  studentMapService.getAllTopStudents(studentMapService.findAll(),test);
    }

    @PostMapping("/students")
    public void addStudent( @RequestBody Student student){
        studentMapService.save(student);
    }

    @PutMapping("/students")
    public void updateStudent(
            @PathVariable("id") Long id,
            @RequestBody Student student){
        studentMapService.save(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") Long id){
        studentMapService.deleteById(id);
    }
}
