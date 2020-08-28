package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Produit implements Serializable {
	@Id @GeneratedValue
private long id;
private String description;
private double prix;
private int quantite;
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit(String description, double prix, int quantite) {
	super();
	this.description = description;
	this.prix = prix;
	this.quantite = quantite;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}


}
