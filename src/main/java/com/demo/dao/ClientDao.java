package com.demo.dao;

import com.demo.dao.mapper.ClientMapper;
import com.demo.domain.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDao {

    @Autowired
    private ClientMapper clientMapper;

    /**
     * Получить клиента по его id
     *
     * @param id id клиента
     * @return клиент
     */
    public Client get(Long id) {
        return clientMapper.get(id);
    }

    /**
     * Сохранить клиента в базе
     *
     * @param client клиент
     */
    public void save(Client client) {
        clientMapper.save(client);
    }
}
