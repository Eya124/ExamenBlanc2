package eya.exam.tn.repositories;

import eya.exam.tn.Project;
import eya.exam.tn.Role;
import eya.exam.tn.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ProjectRepositorie extends JpaRepository<Project,Integer> {
List<Project> findAllBySprintsStartdateGreaterThan(LocalDate date);
List<Project> findAllByUserRoleAndUserFnameAndUserLname(Role r,String name,String lname);


}
