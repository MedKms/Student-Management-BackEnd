package ma.enset.studentmanagement.web;

import ma.enset.studentmanagement.entities.Student;
import ma.enset.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping(path = "/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping(path = "/all")
    public List <Student> getStudents(){
        return studentService.students();
    }
    @GetMapping(path = "/{lastName}")
    public Student getStudent(@PathVariable String lastName){
        return studentService.getStudent(lastName);
    }
    @PostMapping(path = "/save")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @PutMapping(path = "/update")
    public Student updateStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
