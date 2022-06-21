package SERVICE;


import ENTITIES.SPID;
import ENTITIES.Status;
import ENTITIES.USER;

import java.util.LinkedList;
import java.util.List;

public class CRUD_OP2 {

    List<SPID> Spids=new LinkedList<>();
    List<USER> user=new LinkedList<>();

    public void AddSpid(SPID spid) {

        Spids.add(spid);
    }

    public void UpdateSpid(SPID spid, Long id, USER user, Status status, String description){
        spid.setId(id);
        spid.setUser(user);
        spid.setStatusName(status);
        spid.setDescription(description);

    }


    public List<SPID> ShowSpid(){
        return Spids;
    }



}
