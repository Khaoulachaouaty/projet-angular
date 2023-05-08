package com.khaoula.livre.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Livre {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idLivre;
private String nomLivre;
private Double prixLivre;
private Date datePublication;
@ManyToOne
private Editeur editeur;

public Livre() {
super();
}
public Livre(String nomLivre, Double prixLivre, Date datePublication) {
super();
this.nomLivre = nomLivre;
this.prixLivre = prixLivre;
this.datePublication = datePublication;
}
public Long getIdLivre() {
	return idLivre;
}
public void setIdLivre(Long idLivre) {
	this.idLivre = idLivre;
}
public String getNomLivre() {
	return nomLivre;
}
public void setNomLivre(String nomLivre) {
	this.nomLivre = nomLivre;
}
public Double getPrixLivre() {
	return prixLivre;
}
public void setPrixLivre(Double prixLivre) {
	this.prixLivre = prixLivre;
}
public Date getDatePublication() {
	return datePublication;
}
public void setDatePublication(Date datePublication) {
	this.datePublication = datePublication;
}
public Editeur getEditeur() {
	return editeur;
}
public void setEditeur(Editeur editeur) {
	this.editeur = editeur;
}
@Override
public String toString() {
	return "Livre [idLivre=" + idLivre + ", nomLivre=" + nomLivre + ", prixLivre=" + prixLivre + ", datePublication="
			+ datePublication + ", editeur=" + editeur + "]";
}

}