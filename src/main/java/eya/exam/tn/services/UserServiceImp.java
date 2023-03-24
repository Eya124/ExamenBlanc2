package eya.exam.tn.services;

import eya.exam.tn.Project;
import eya.exam.tn.User;
import eya.exam.tn.repositories.ProjectRepositorie;
import eya.exam.tn.repositories.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements  UserService{
    @Autowired
    private UserRepositorie userRepositorie;
    private ProjectRepositorie projectRepositorie;
    @Override
    public User addUser(User user) {
        userRepositorie.save(user);
        return user;
    }

    @Override
    public void assignProjectToUser(int projectId, int userId) {
            Project project = projectRepositorie.findById(projectId).orElse(null);
            User user = userRepositorie.findById(userId).orElse(null);


            //vérification des objets
            if ((project!=null) && (user!=null)) {
                //traitement
                List<Project> projects =new ArrayList<>();
                projects.add(project);
                user.setProjects(projects);
                //departement.getEtu().add(etudiant);
                //saving
                userRepositorie.saveAndFlush(user);
            }

        }

    @Override
    public void assignProjectToClient(int projectId, String firstName, String lastName) {
        Project project = projectRepositorie.findById(projectId).orElse(null);
        User user = userRepositorie.findByFnameAndLname(firstName,lastName);


        //vérification des objets
        if ((project!=null) && (user!=null)) {
            //traitement
            if (user.getRole().equals("CLIENT")){
            List<Project> projects =new ArrayList<>();
            projects.add(project);
            user.setProjects(projects);
            //departement.getEtu().add(etudiant);
            //saving
            userRepositorie.saveAndFlush(user);}
        }





    }

};

