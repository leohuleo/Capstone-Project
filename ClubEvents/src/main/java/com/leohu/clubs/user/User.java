package com.leohu.clubs.user;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    @NotNull
    @Size(min=1,max=30)
    @Email(message="Must Be A Valid Email")
    private String email;

    @Column(nullable = false, unique = true)
    @NotNull
    @Size(min=2,max=15, message= "Size Must Be Between 2 - 15 Characters")
    private String username;

    @Column(nullable = false)
    @Size(min=6,max=20, message = "Size Must be Between 6 - 20 Characters")
    private String password;

    @Column(nullable = false)
    private boolean enabled;

    @Column(nullable = false)
    private String role = "ROLE_USER";
}
