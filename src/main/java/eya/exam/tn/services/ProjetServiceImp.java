package eya.exam.tn.services;

import eya.exam.tn.Project;
import eya.exam.tn.Role;
import eya.exam.tn.repositories.ProjectRepositorie;
import eya.exam.tn.repositories.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
public class ProjetServiceImp implements ProjetService{
    @Autowired
    private ProjectRepositorie projectRepositorie;
    @Override
    @Transactional
    public Project addProject(Project project) {

        projectRepositorie.saveAndFlush(project);

        project.getSprints().forEach(sprint -> {sprint.setProject2(project);});

        return project;
    }
@Transactional
    @Override
    public List<Project> getAllCurrentProject() {
        return projectRepositorie.findAllBySprintsStartdateGreaterThan(LocalDate.now());
    }

    @Override
    public List<Project> getProjectsByScrumMaster(String fName, String lName) {
        return projectRepositorie.findAllByUserRoleAndUserFnameAndUserLname(Role.SCRUM_MASTER,fName,lName);
    }
}
