package com.mustafabulu.services;


import com.mustafabulu.entity.UserEntity;
import com.mustafabulu.repository.IUserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class RegisterRest {

    @Autowired
    IUserRepository iUserRepository;

    // http://localhost:8080/rest/list/
    // service for list all user
    @GetMapping(value = "/rest/list")
    public List<UserEntity> getListUser(){
        return (List<UserEntity>) iUserRepository.findAll();
    }

    }


    











