package garg.digaant.StudentTestSpring.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test {

    @Id
    @GeneratedValue
    private Long id;

    private String courseName;
    private String marks;


    public Test(Long id, String courseName, String marks) {
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
