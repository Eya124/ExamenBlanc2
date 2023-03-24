package eya.exam.tn.controllers;

import eya.exam.tn.User;
import eya.exam.tn.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("add")
    public User addUser (@RequestBody User user){
        return userService.addUser(user) ;};
    @PostMapping("/{projectId}/{userId}")
    public void assignProjectToUser (@PathVariable int projectId, @PathVariable int userId){
        userService.assignProjectToUser(projectId,userId);
    };
    @PostMapping("/{projectId}")
    public void assignProjectToClient(@PathVariable int projectId, @RequestBody String firstName, @RequestBody String lastName)
    {userService.assignProjectToClient(projectId,firstName,lastName);};
}

