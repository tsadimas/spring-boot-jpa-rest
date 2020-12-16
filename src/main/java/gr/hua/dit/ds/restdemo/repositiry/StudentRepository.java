package gr.hua.dit.ds.restdemo.repositiry;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import gr.hua.dit.ds.restdemo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
