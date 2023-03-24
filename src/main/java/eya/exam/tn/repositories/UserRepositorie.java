package eya.exam.tn.repositories;

import eya.exam.tn.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorie extends JpaRepository<User,Integer> {
    User findByRole(String role);
    User findByFnameAndLname(String name,String lastname);
}
