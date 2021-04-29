package com.leohu.clubs.organization;


import com.leohu.clubs.user.User;
import com.leohu.clubs.user.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/clubs")
public class ClubController {

    @Autowired
    ClubRepository clubRepository;

    @GetMapping(path = "/")
    public @ResponseBody
    List<Club> allClubs(){
        return clubRepository.findAll();
    }

    @GetMapping(path = "/create")
    public String createClubForm(Model model){
        model.addAttribute("clubRegistration", new ClubRegistration());
        return "clubCreationForm";
    }

    @PostMapping(path = "/create")
    public String createClubFormSubmit(@ModelAttribute @Valid ClubRegistration clubRegistration, BindingResult bindingResult, Model model, Authentication authentication){
        if(bindingResult.hasErrors()){
            return "clubCreationForm";
        }
        clubRegistration.setCreator(authentication.getName());
        Club club = clubRegistration.getNewClub();
        clubRepository.save(club);
        model.addAttribute("club", clubRegistration);
        return "clubCreationFormResult";
    }
}
