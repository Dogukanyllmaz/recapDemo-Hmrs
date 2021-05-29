package kodlamaio.hmrs.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hmrs.entities.concretes.Employee;
import kodlamaio.hmrs.entities.concretes.User;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
	List<Employee> findAllByNationalityId(String nationalityId);
	List<User> findAllByEmail(String email);

}
