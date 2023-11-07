package com.ynov.commerce.dao;

import com.ynov.commerce.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}