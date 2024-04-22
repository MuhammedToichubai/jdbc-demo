package java13.models;

import lombok.*;

import java.time.LocalDate;
/**
 * @author Mukhammed Asantegin
 */
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private Long id;
    private String fullName;
    private String email;
    private LocalDate dateOfBirth;

    public Student(String fullName, String email, LocalDate dateOfBirth) {
        this.fullName = fullName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
}
