package com.leohu.clubs.organization;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class ClubRegistration {

    private int id;

    private String creator;

    private String title;

    private String description;

    private boolean isActive;

    public Club getNewClub(){
        Club club = new Club();
        club.setActive(true);
        club.setTitle(title);
        club.setDescription(description);
        club.setCreator(creator);
        return club;
    }
}
