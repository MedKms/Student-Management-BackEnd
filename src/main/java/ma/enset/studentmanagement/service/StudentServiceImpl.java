package ma.enset.studentmanagement.service;

import ma.enset.studentmanagement.entities.Student;
import ma.enset.studentmanagement.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> students() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(String lastname) {
        return studentRepository.findStudentByLastName(lastname);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student=studentRepository.findById(id).get();
        studentRepository.delete(student);
    }


}
