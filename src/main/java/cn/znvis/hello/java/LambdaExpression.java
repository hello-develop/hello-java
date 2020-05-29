package cn.znvis.hello.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * DESC
 *
 * @author cc
 * @date 2020/5/29
 */
public class LambdaExpression {

    public static void main(String[] args) {

        HelloInterface helloInterface = () -> {
            System.out.println(">>> hello lambda");
        };
        helloInterface.hello();

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "a"));
        studentList.add(new Student(2, "b"));
        studentList.add(new Student(3, "c"));
        studentList.add(new Student(4, "d"));

        List<Integer> idList = studentList.stream().map(Student::getId).collect(Collectors.toList());
        idList.forEach(System.out::println);
        idList.forEach(id -> {
            System.out.println("------");
            System.out.println(id);
        });
    }

    public static class Student {

        Integer id;
        String name;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
