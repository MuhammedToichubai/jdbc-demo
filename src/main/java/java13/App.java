package java13;

import java13.models.Student;
import java13.services.StudentService;
import java13.services.StudentServiceImpl;
import java.time.LocalDate;

/**
 * @author Mukhammed Asantegin
 */
public class App {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();

        studentService.createTable();

        Student student = new Student("Sabina",
                "sabina@gmail.com",
                LocalDate.of(2000, 4, 20));

        String message = studentService.saveStudent(student);
        System.out.println(message);

        System.out.println("Find by di: ");
        try {
            System.out.println(studentService.findById(3L));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(studentService.updateById(3L, student));


    }
}
