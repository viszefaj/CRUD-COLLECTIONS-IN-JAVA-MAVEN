package Service;

import Entities.Spid;

import java.util.List;

public interface Crud_S {

    public abstract void AddSpid(Spid spid);
    public abstract void UpdateSpid(Spid spid);
    public abstract List<Spid> ShowSpid();
}
