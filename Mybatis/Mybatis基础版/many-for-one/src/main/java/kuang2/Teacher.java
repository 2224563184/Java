package kuang2;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private String name;
    private   int age;
    private  int tid;
    private List<Student> student;
}
