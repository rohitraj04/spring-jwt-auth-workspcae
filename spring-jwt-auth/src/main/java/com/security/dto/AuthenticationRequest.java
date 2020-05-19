package com.security.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationRequest implements Serializable {

	private static final long serialVersionUID = -6927954859470487913L;

	private String userName;
	private String password;

}
