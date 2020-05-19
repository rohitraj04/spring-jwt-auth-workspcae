package com.security.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse implements Serializable {

	private static final long serialVersionUID = -1350613388387787773L;
	
	private final String jwt;


}
