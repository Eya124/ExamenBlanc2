package eya.exam.tn.controllers;

import eya.exam.tn.Project;
import eya.exam.tn.services.ProjetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Project")
@RequiredArgsConstructor
public class ProjectController {
    ProjetService projetService;
    @PostMapping("/new")
    public Project addProject (Project project)
    {return projetService.addProject(project);};
    @GetMapping("/allCurrent")
    public List<Project> getAllCurrentProject(){
        return projetService.getAllCurrentProject();
    } ;
    @GetMapping("/GetByScrum")
    public List<Project> getProjectsByScrumMaster(@RequestBody String fName, @RequestBody String lName){
        return projetService.getProjectsByScrumMaster(fName,lName);
    };

}
