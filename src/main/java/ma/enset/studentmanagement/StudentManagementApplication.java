package ma.enset.studentmanagement;

import ma.enset.studentmanagement.entities.Student;
import ma.enset.studentmanagement.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class StudentManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }
    @Bean
    CommandLineRunner run(StudentRepository studentRepository){
        return args ->{
            studentRepository.save(new Student(null,"Mohamed","KEMMOUS","81 AIT RBAA Midelt", LocalDate.now(),"https://cutt.ly/dPduy92"));
            studentRepository.save(new Student(null,"Anas","AIT ICHOU","81 AIT RBAA Midelt",LocalDate.now(),"https://cutt.ly/UPdug00"));
            studentRepository.save(new Student(null,"Anouar","JIMI","81 AIT RBAA Midelt",LocalDate.now(),"https://cutt.ly/gPduvrk"));
            studentRepository.save(new Student(null,"Hamza","MAAMOU","81 AIT RBAA Midelt",LocalDate.now(),"https://cutt.ly/FPduEaQ"));
            studentRepository.save(new Student(null,"Khalid","KEMMOUS","81 AIT RBAA Midelt",LocalDate.now(),"https://cutt.ly/DPduUv4"));
        };
    }
}
