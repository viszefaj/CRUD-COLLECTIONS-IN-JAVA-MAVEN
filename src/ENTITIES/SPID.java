package ENTITIES;

import SERVICE.CRUD_OP;


public class SPID extends BASE{

    private Long id;
    private USER user;
    private Status StatusName = Status.PENDING;
    public String description;


    public SPID(Long id, USER user, Status status, String description) {
        super(null,null,null);
        this.user = user;
        this.id=id;
        this.description=description;
    }

    public SPID(){
        super(null,null,null);
    }


    public USER getUser() {
        return user; }

    public void setUser(USER user)
    {
        this.user=user;
    }

    @Override
    public Long getId() {
        return id;
    }

    public Status getStatusName() {
        return StatusName;
    }

    public void setStatusName(Status statusName) {
        StatusName = statusName;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}




