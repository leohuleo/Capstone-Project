package com.leohu.clubs.user;


import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping(path="/create")
    public String userCreationForm(Model model){
        model.addAttribute("user", new User());
        return "userCreationForm";
    }

    @PostMapping(path="/create")
    public String userCreationFormSubmit(@ModelAttribute @Valid User user, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            return "userCreationForm";
        }
        user.setEnabled(true);
        userRepository.save(user);
        model.addAttribute("user", user);
        return "userCreationFormResult";
    }

    @GetMapping(path="/allUsers")
    public @ResponseBody List<User> allUser(){
        return userRepository.findAll();
    }
}
