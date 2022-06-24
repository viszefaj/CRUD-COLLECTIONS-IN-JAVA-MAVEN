package com.springboot.demo.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "spid")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Spid extends Base {
    @Enumerated(EnumType.STRING)
    private SpidStatus status;
    @Enumerated(EnumType.STRING)
    private Type type;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

}
