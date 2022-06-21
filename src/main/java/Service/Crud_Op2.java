package Service;

import Entities.Spid;
import Entities.Status;
import Entities.User;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class Crud_Op2 {

    public List<Spid> Spids=new LinkedList<>();
    List<User> user=new LinkedList<>();

    public void AddSpid(Spid spid) {

        Spids.add(spid);
    }

    public void UpdateSpid(Spid spid, Long id, User user, Status status, String description){
        spid.setId(id);
        spid.setUser(user);
        spid.setStatusName(status);
        spid.setDescription(description);

    }


    public List<Spid> ShowSpid(){
        return Spids;
    }



}
