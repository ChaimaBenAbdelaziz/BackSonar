package com.esprit.examen.entities;





public class OperateurRequest {

	private Long idOperateur;
	private String nom;
	private String prenom;
	
	private String password;

	public Long getIdOperateur() {
		return idOperateur;
	}

	public void setIdOperateur(Long idOperateur) {
		this.idOperateur = idOperateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
