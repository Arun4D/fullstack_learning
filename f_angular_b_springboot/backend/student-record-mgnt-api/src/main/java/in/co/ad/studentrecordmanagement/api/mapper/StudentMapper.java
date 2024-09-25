package in.co.ad.studentrecordmanagement.api.mapper;

import in.co.ad.studentrecordmanagement.api.domain.StudentDo;
import in.co.ad.studentrecordmanagement.api.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentMapper {

    private final ModelMapper modelMapper;

    public StudentDo toStudentDo(StudentDto studentDto) {
        return modelMapper.map(studentDto, StudentDo.class);
    }

    public StudentDto toCustomerDto(StudentDo studentDo) {
        return modelMapper.map(studentDo, StudentDto.class);
    }
}
