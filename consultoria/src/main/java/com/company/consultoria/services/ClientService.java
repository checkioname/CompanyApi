package com.company.consultoria.services;


import com.company.consultoria.entity.Client;
import com.company.consultoria.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class ClientService {

    private final ClientRepository repo;

    @Autowired
    public ClientService(ClientRepository repo) {
        this.repo = repo;
    }

    public Optional<Client> findbyCpf (String cpf){
        //log.info();
        Optional<Client> user = repo.findByCpf(cpf);
        return user;
    }
}
