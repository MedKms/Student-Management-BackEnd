package ma.enset.studentmanagement.repositories;

import ma.enset.studentmanagement.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findStudentByLastName(String lastName);
}
