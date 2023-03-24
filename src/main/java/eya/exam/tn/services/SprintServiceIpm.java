package eya.exam.tn.services;

import eya.exam.tn.Project;
import eya.exam.tn.Sprint;
import eya.exam.tn.repositories.ProjectRepositorie;
import eya.exam.tn.repositories.SprintRepositorie;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class SprintServiceIpm implements SprintService{
    ProjectRepositorie projectRepositorie;
    SprintRepositorie sprintRepositorie;
    @Override
    public void addSprintAndAssignToProject(Sprint sprint, int idProject) {
        Project project = projectRepositorie.findById(idProject).orElse(null);
        Assert.notNull(project, "universite must not be null.") ;
        //ki yabda andi objet jdid me houch jei mil bd na3emlou 3 line
        List<Sprint> sprints =new ArrayList<>();
        sprints.add(sprint);
        project.setSprints(sprints);
        // KHATER ANDICH LIST
        sprintRepositorie.saveAndFlush(sprint);

    }
}
