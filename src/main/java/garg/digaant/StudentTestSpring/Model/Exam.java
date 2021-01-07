package garg.digaant.StudentTestSpring.Model;

import javax.persistence.*;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;
    private String marks;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;


    public Exam() {
    }

    public Exam(Long id, String courseName, String marks) {
        this.id = id;
        this.courseName = courseName;
        this.marks = marks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Test{" +
                "courseName='" + courseName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
