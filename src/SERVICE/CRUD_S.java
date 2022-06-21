package SERVICE;


import ENTITIES.SPID;

import java.util.List;

public interface CRUD_S {

    public abstract void AddSpid(SPID spid);
    public abstract void UpdateSpid(SPID spid);
    public abstract List<SPID> ShowSpid();
}
