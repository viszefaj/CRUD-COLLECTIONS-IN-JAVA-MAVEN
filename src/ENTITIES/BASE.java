package ENTITIES;

import java.sql.Timestamp;
import java.util.Date;

public class BASE {
    private Long id;
    private Date createdAt;
    private Date modifiedAt;

    public BASE(Long id,Date createdAt,Date modifiedAt){
        this.id=id;
        this.createdAt=createdAt;
        this.modifiedAt=modifiedAt;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
