package ENTITIES;

import java.sql.Timestamp;
import java.util.Date;

public class USER extends BASE {

    private Long id;
    private String name;
    private String surname;
    private String username;

public USER(Long id,Date createdAt,Date modifiedAt,String name,String surname,String username){
    super(id,createdAt,modifiedAt);
    this.id=id;
    this.name=name;
    this.surname=surname;
    this.username=username;


}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
