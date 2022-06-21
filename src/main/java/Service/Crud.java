package Service;

import Entities.User;

import java.util.List;

public interface Crud {

    public abstract void AddUser(User user);
    public abstract void UpdateUser(User user ,Long id,String name,String surname,String username);
    public abstract List<User> ShowUser();
}
