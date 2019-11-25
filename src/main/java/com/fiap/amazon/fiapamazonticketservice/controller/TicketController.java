package com.fiap.amazon.fiapamazonticketservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.amazon.fiapamazonticketservice.domain.model.Ticket;
import com.fiap.amazon.fiapamazonticketservice.service.TicketService;

@RestController
@RequestMapping(path = "/ticket", produces = { MediaType.APPLICATION_JSON_VALUE })
@CrossOrigin("*")
public class TicketController {

	private static final String ID_PATH_VARIABLE = "/{id:^(?!count).+}";

	@Autowired
	private TicketService ticketService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Ticket create(@RequestBody @Valid final Ticket ticket) {
		return ticketService.create(ticket);
	}

	@DeleteMapping(ID_PATH_VARIABLE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable final Integer id) {
		ticketService.delete(id);
	}

	@GetMapping(ID_PATH_VARIABLE)
	@ResponseStatus(HttpStatus.OK)
	public Ticket get(@PathVariable final Integer id) {
		return ticketService.findByid(id);
	}

	@PutMapping(value = ID_PATH_VARIABLE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@RequestBody @Valid final Ticket ticket, @PathVariable final Integer id) {
		ticketService.update(ticket, id);
	}

}
