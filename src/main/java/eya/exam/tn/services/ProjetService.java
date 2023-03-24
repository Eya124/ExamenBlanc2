package eya.exam.tn.services;

import eya.exam.tn.Project;

import java.util.List;

public interface ProjetService {
    public Project addProject (Project project);
    public List<Project> getAllCurrentProject() ;
    public List<Project> getProjectsByScrumMaster(String fName, String lName);
}
