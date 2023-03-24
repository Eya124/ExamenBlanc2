package eya.exam.tn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String email;
    String pwd;
    String fname;
    String lname;
    @Enumerated(EnumType.STRING)
    Role role;
    @ManyToMany
    List<Project> projects;
    @OneToMany
    List<Project> project;
}
