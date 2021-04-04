package com.leohu.clubs.user;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
public class UserRegistration {

    @Size(min=1,max=30)
    @Email(message="Must Be A Valid Email")
    private String email;

    @Size(min=2,max=15, message= "Size Must Be Between 2 - 15 Characters")
    private String username;

    @Size(min=6,max=15, message= "Size Must Be Between 6 - 15 Characters")
    private String password;

    public User getNewUser(){
        User user = new User();
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);
        user.setRole("ROLE_USER");
        user.setEnabled(true);
        return user;
    }
}
