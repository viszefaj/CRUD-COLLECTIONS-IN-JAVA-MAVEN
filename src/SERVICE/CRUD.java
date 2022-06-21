package SERVICE;

import ENTITIES.SPID;
import ENTITIES.USER;

import java.util.List;

public interface CRUD {

    public abstract void AddUser(USER user);
    public abstract void UpdateUser(USER user ,Long id,String name,String surname,String username);
    public abstract List<USER> ShowUser();
}
