package garg.digaant.StudentTestSpring.Controller;


import garg.digaant.StudentTestSpring.Model.Student;
import garg.digaant.StudentTestSpring.Repository.Map.StudentMapService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    private StudentMapService studentMapService;

    public StudentController(StudentMapService studentMapService) {
        this.studentMapService = studentMapService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return (List<Student>) studentMapService.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentMapService.findById(id);
    }

    @GetMapping("/students/{test}")
    public List<Student> getAllTopStudents(@PathVariable String test){
        return (List<Student>) studentMapService.getAllTopStudents(studentMapService.findAll(),test);
    }

    @PostMapping("/students")
    public void addStudent( @RequestBody Student student){
        studentMapService.save(student);
    }

    @PutMapping("/students")
}
