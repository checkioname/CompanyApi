package com.company.consultoria.controller;


import com.company.consultoria.repository.ClientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;



@Controller
@RequestMapping(path="user/")
public class UserController {

    @Autowired
    private ClientRepository accountRepository;
}



