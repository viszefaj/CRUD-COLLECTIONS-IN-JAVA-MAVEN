package Entities;

public class Spid extends Base {

    private Long id;
    private User user;
    private Status StatusName = Status.PENDING;
    public String description;


    public Spid(Long id, User user, Status status, String description) {
        super(null,null,null);
        this.user = user;
        this.id=id;
        this.description=description;
    }

    public Spid(){
        super(null,null,null);
    }

    public User getUser() {
        return user; }

    public void setUser(User user)
    {
        this.user=user;
    }


    public Long getId() {
        return id;
    }

    public Status getStatusName() {
        return StatusName;
    }

    public void setStatusName(Status statusName) {
        StatusName = statusName;
    }


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
