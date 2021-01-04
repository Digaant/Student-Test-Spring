package garg.digaant.StudentTestSpring.Model;

import javax.persistence.Entity;

@Entity
public class Test {

    private String courseName;
    private String marks;



    public Test() {
    }

    public Test(String courseName, String marks) {
        this.courseName = courseName;
        this.marks = marks;
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
