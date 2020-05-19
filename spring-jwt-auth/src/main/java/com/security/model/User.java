package com.security.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_JWT")
public class User implements Serializable {

	private static final long serialVersionUID = -5569745318527303411L;
	@Id
	private Long id;
	private String userName;
	private String password;
	private String email;

}
