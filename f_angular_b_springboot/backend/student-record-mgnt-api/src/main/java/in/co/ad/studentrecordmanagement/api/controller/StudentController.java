package in.co.ad.studentrecordmanagement.api.controller;

import in.co.ad.studentrecordmanagement.api.domain.StudentDo;
import in.co.ad.studentrecordmanagement.api.dto.StudentDto;
import in.co.ad.studentrecordmanagement.api.exception.StudentNotFoundException;
import in.co.ad.studentrecordmanagement.api.mapper.StudentMapper;
import in.co.ad.studentrecordmanagement.api.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("unused")
@RestController
@RequestMapping("api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    private final StudentMapper studentMapper;

    @PostMapping("/")
    public ResponseEntity<StudentDto> createStudent(StudentDto studentDto) {
        StudentDo studentDo = studentMapper.toStudentDo(studentDto);

        studentDo =  studentService.save(studentDo);
        studentDto = studentMapper.toCustomerDto(studentDo);
        return new ResponseEntity<>(studentDto, HttpStatus.CREATED);
    }
    @PutMapping("/")
    public ResponseEntity<StudentDto> updateStudent(StudentDto studentDto) {
        StudentDo studentDo = studentMapper.toStudentDo(studentDto);

        studentDo =  studentService.update(studentDo);
        studentDto = studentMapper.toCustomerDto(studentDo);
        return new ResponseEntity<>(studentDto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getCustomerById(@PathVariable int id) throws StudentNotFoundException {
        StudentDo studentDo = studentService.get(id);
        StudentDto studentDto = studentMapper.toCustomerDto(studentDo);
        return new ResponseEntity<>(studentDto, HttpStatus.OK);
    }

    @ExceptionHandler(StudentNotFoundException.class)
    ResponseEntity<String> studentNotFound(StudentNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}