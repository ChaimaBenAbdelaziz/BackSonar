package com.esprit.examen.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OperateurRequest {

	private Long idOperateur;
	private String nom;
	private String prenom;
	private String password;
}
