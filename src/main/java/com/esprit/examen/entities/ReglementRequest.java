package com.esprit.examen.entities;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Getter;

@Entity
@Getter

public class ReglementRequest {

	private Long idReglement;
	private float montantPaye;
	private float montantRestant;
	private Boolean payee;
	private Date dateReglement;
	
	
	
}
