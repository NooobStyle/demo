package com.demo.converter;

import com.demo.domain.model.Client;
import com.demo.domain.transport.ClientDto;
import org.springframework.stereotype.Service;

@Service
public class ClientConverter {

    public ClientDto convert(Client client) {
        ClientDto dto = new ClientDto();

        dto.setFirstName(client.getFirstName());
        dto.setLastName(client.getLastName());
        dto.setIsDeleted(client.getIsDeleted());

        return dto;
    }

    public Client convert(ClientDto dto) {
        Client client = new Client();

        client.setFirstName(dto.getFirstName());
        client.setLastName(dto.getLastName());
        client.setIsDeleted(dto.getIsDeleted());

        return client;
    }
}
