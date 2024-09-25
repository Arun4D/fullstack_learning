package in.co.ad.studentrecordmanagement.api.service;

import in.co.ad.studentrecordmanagement.api.domain.StudentDo;
import in.co.ad.studentrecordmanagement.api.exception.StudentNotFoundException;

public interface StudentService {

    StudentDo save(StudentDo studentDo);
    StudentDo update(StudentDo studentDo);
    StudentDo get(Integer id) throws StudentNotFoundException;
}
