package eya.exam.tn.controllers;

import eya.exam.tn.Sprint;
import eya.exam.tn.services.SprintService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Sprint")
@RequiredArgsConstructor
public class SprintController {
    SprintService sprintService;
    @PostMapping("/idProject")
    public void addSprintAndAssignToProject(@RequestBody Sprint sprint, @PathVariable int idProject){
        sprintService.addSprintAndAssignToProject(sprint,idProject);
    };

}
