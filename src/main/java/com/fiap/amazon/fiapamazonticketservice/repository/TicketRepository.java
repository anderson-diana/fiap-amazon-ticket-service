package com.fiap.amazon.fiapamazonticketservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.amazon.fiapamazonticketservice.domain.model.Ticket;;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}

