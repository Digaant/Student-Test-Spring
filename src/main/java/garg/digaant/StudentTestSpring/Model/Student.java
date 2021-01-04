package garg.digaant.StudentTestSpring.Model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Set<Test> tests = new HashSet<>();

    public Student() {
    }

    public Student(Long id, String name, int age, Set<Test> tests) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tests = tests;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", tests=" + tests +
                '}';
    }
}
