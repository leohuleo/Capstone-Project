package com.leohu.clubs.organization;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClubRepository extends JpaRepository<Club,Integer> {
    List<Club> findAll();
}
