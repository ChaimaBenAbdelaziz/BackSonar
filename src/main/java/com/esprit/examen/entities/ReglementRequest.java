package com.esprit.examen.entities;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ReglementRequest {

	private Long idReglement;
	private float montantPaye;
	private float montantRestant;
	private Boolean payee;
	private Date dateReglement;
	
	
	
}
