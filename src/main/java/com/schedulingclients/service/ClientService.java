package com.schedulingclients.service;

import com.schedulingclients.repositoty.ClientRepository;
import com.schedulingclients.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public List<Client> findAll() {
        return repository.findAll();
    }
}
