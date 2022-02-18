package ma.enset.studentmanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String adress;
    private LocalDate birthDay;
    private String picture;
    private String email;

    public Student(Long id, String firstName, String lastName, String adress, LocalDate birthDay, String picture) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.birthDay = birthDay;
        this.picture = picture;
        this.email=firstName+"."+lastName.toLowerCase()+"@gmail.com";
    }
}
