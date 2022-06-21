package Service;

import Entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Crud_Op implements Crud{
    public List<User> Users=new ArrayList<User>();
    @Override
    public void AddUser(User user) {

        Users.add(user);
    }

    @Override
    public void UpdateUser(User user ,Long id,String name,String surname,String username){
        user.setId(id);
        user.setName(name);
        user.setSurname(surname);
        user.setUsername(username);

    }


    @Override
    public List<User> ShowUser(){
        return Users;
    }


}
