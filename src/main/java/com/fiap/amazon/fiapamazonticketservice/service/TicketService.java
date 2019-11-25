package com.fiap.amazon.fiapamazonticketservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.amazon.fiapamazonticketservice.domain.model.Ticket;
import com.fiap.amazon.fiapamazonticketservice.exception.TicketNotFoundException;
import com.fiap.amazon.fiapamazonticketservice.repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	public Ticket findByid(Integer id) {
		return ticketRepository.findById(id).orElseThrow(TicketNotFoundException::new);
	}

	public Ticket create(final Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	public Ticket update(final Ticket ticket, Integer id) {
		if (!ticketRepository.existsById(id)) {
			throw new TicketNotFoundException();
		}

		return ticketRepository.save(ticket);
	}

	public void delete(final Integer id) {
		if (!ticketRepository.existsById(id)) {
			throw new TicketNotFoundException();
		}
		ticketRepository.deleteById(id);
	}

}

