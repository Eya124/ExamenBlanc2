package eya.exam.tn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String title;
    String description;
    @ManyToMany(mappedBy = "projects")
    List<User> user;
    @OneToMany(mappedBy = "project2",cascade = CascadeType.PERSIST)
    List<Sprint> sprints;


}
