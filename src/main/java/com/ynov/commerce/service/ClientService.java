package com.ynov.commerce.service;

import com.ynov.commerce.dto.ClientDto;
import com.ynov.commerce.entities.Client;

import java.util.List;

public interface ClientService {
    Client saveClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Long id);
    List<ClientDto> getAllClients();
}
