package com.demo.service;

import com.demo.dao.ClientDao;
import com.demo.domain.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientDao clientDao;

    public Client get(Long id) {
        return clientDao.get(id);
    }

    public void save(Client client) {
        clientDao.save(client);
    }
}
