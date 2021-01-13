package gr.hua.dit.ds.restdemo.repositiry;

import gr.hua.dit.ds.restdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}