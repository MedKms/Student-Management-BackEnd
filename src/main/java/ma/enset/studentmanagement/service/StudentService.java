package ma.enset.studentmanagement.service;

import ma.enset.studentmanagement.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> students();
    Student getStudent(String lastname);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
}
