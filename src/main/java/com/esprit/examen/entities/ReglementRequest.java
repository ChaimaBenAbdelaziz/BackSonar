package com.esprit.examen.entities;

import java.util.Date;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ReglementRequest {

	private Long idReglement;
	private float montantPaye;
	private float montantRestant;
	private Boolean payee;
	private Date dateReglement;
	
	public ReglementRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ReglementRequest(Long idReglement, float montantPaye, float montantRestant, Boolean payee,
			Date dateReglement) {
		super();
		this.idReglement = idReglement;
		this.montantPaye = montantPaye;
		this.montantRestant = montantRestant;
		this.payee = payee;
		this.dateReglement = dateReglement;
	}

	public Long getIdReglement() {
		return idReglement;
	}
	public void setIdReglement(Long idReglement) {
		this.idReglement = idReglement;
	}
	public float getMontantPaye() {
		return montantPaye;
	}
	public void setMontantPaye(float montantPaye) {
		this.montantPaye = montantPaye;
	}
	public float getMontantRestant() {
		return montantRestant;
	}
	public void setMontantRestant(float montantRestant) {
		this.montantRestant = montantRestant;
	}
	public Boolean getPayee() {
		return payee;
	}
	public void setPayee(Boolean payee) {
		this.payee = payee;
	}
	public Date getDateReglement() {
		return dateReglement;
	}
	public void setDateReglement(Date dateReglement) {
		this.dateReglement = dateReglement;
	}
	
}
