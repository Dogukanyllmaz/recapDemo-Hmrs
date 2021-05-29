package kodlamaio.hmrs.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hmrs.entities.concretes.Employer;
import kodlamaio.hmrs.entities.concretes.User;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	
	List<Employer> findAllByTaxNumber(String taxNumber);
	List<User> findAllByEmail(String email);

}
