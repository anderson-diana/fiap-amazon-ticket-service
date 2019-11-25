package com.fiap.amazon.fiapamazonticketservice.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class FieldError {

	private String field;
	private String error;

}
