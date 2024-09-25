package in.co.ad.studentrecordmanagement.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "student")
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
public class StudentDo {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String dob;
    private String phoneNumber;


}
