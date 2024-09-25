package in.co.ad.studentrecordmanagement.api.dto;

import lombok.Data;

@Data
public class StudentDto {

    private int id;
    private String firstName;
    private String lastName;
    private String dob;
    private String phoneNumber;
}
