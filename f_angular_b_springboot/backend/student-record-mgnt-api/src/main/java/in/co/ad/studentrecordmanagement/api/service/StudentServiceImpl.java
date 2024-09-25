package in.co.ad.studentrecordmanagement.api.service;

import in.co.ad.studentrecordmanagement.api.domain.StudentDo;
import in.co.ad.studentrecordmanagement.api.exception.StudentNotFoundException;
import in.co.ad.studentrecordmanagement.api.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@SuppressWarnings("unused")
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public StudentDo save(StudentDo studentDo) {
        return studentRepository.save(studentDo);
    }

    @Override
    public StudentDo update(StudentDo studentDo) {
        return studentRepository.save(studentDo);
    }

    @Override
    public StudentDo get(Integer id) throws StudentNotFoundException {
        Optional<StudentDo> studentDoOpt = studentRepository.findById(id);
        return studentDoOpt.orElseThrow(() -> new StudentNotFoundException("No record found for id: "+id));
    }
}
