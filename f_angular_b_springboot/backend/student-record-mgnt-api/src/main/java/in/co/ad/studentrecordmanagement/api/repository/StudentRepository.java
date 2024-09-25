package in.co.ad.studentrecordmanagement.api.repository;

import in.co.ad.studentrecordmanagement.api.domain.StudentDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<StudentDo, Integer>{

}
