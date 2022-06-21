package SERVICE;

import ENTITIES.USER;

import java.util.ArrayList;
import java.util.List;

public class CRUD_OP implements CRUD{

    List<USER> Users=new ArrayList<USER>();
    @Override
    public void AddUser(USER user) {

        Users.add(user);
    }

    @Override
    public void UpdateUser(USER user ,Long id,String name,String surname,String username){
        user.setId(id);
        user.setName(name);
        user.setSurname(surname);
        user.setUsername(username);

    }


    @Override
    public List<USER> ShowUser(){
        return Users;
    }

}
