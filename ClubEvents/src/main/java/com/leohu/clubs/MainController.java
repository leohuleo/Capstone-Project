package com.leohu.clubs;

import com.leohu.clubs.organization.ClubRepository;
import com.leohu.clubs.user.User;
import com.leohu.clubs.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping
public class MainController {

    @Autowired
    ClubRepository clubRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
    @GetMapping(path="/admin/allUsers")
    public String allUser(Model model){
        model.addAttribute("userList", userRepository.findAll());
        return "allUsers";
    }
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("clubList",clubRepository.findAll());
        return "home";
    }

    @GetMapping(path = "/myprofile")
    public String userProfile(Authentication authentication, Model model){
        String username = authentication.getName();
        User user = userRepository.findByUsername(username);
        model.addAttribute("user",user);
        return "userProfile";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout(){
        return "You have been logged out";
    }
}
