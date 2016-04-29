package com.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Voiture {

	
	private int immatricule;
	
	
	private String couleur;
	
	private String marque;
	public Voiture(int immatricule, String couleur, String marque) {
		
		this.immatricule = immatricule;
		this.couleur = couleur;
		this.marque = marque;
	}
	
	public Voiture()
	{
		
	}

	
	public int getImmatricule() {
		return immatricule;
	}

	public void setImmatricule(int immatricule) {
		this.immatricule = immatricule;
	}

	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Voiture [immatricule=" + immatricule + ", couleur=" + couleur
				+ ", marque=" + marque + "]";
	}
	
	
	
}
