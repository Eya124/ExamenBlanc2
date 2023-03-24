package eya.exam.tn.services;

import eya.exam.tn.User;

public interface UserService {
    public User addUser (User user);
    public void assignProjectToUser (int projectId, int userId);
    public void assignProjectToClient(int projectId, String firstName, String lastName);
}
