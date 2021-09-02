package com.javarush.lectures.rest_example.repository;

import com.javarush.lectures.rest_example.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer>  {
}