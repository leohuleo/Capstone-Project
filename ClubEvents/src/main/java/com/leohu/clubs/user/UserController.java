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
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")//Map only POST requests
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email){
        //@ResponseBody means the returned String is the response, not a view name
        //@RequestParam means it is a parameter from the GET or POST request
        User n = new User();
        n.setUsername(name);
        n.setEmail(email);
        n.setPassword("123456");
        userRepository.save(n);
        return "Saved";
    }

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
        userRepository.save(user);
        model.addAttribute("user", user);
        return "userCreationFormResult";
    }

    @GetMapping(path="/allUser")
    public @ResponseBody List<User> allUser(){
        return userRepository.findAll();
    }
}
