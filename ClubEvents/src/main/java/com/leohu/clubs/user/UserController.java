package com.leohu.clubs.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(path="/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping(path="/create")
    public String userCreationForm(Model model){
        model.addAttribute("userRegistration", new UserRegistration());
        return "userCreationForm";
    }

    @PostMapping(path="/create")
    public String userCreationFormSubmit(@ModelAttribute @Valid UserRegistration userRegistration, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            return "userCreationForm";
        }
        User user = userRegistration.getNewUser();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        model.addAttribute("user", userRegistration);
        return "userCreationFormResult";
    }

}
