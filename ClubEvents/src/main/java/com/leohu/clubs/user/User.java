package com.leohu.clubs.user;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(length = 30, nullable = false, unique = true)
    private String username;

    @Column(length = 30, nullable = false, unique = false)
    private String password;
}
