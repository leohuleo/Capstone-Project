package com.leohu.clubs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin</h1>");
    }
    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome</h1>");
    }
}
