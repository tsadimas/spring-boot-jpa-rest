package gr.hua.dit.ds.restdemo.repositiry;



import gr.hua.dit.ds.restdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="students")
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
