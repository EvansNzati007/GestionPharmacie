package com.pharmaGabon.nzati;

public class Medicaments extends GestionPharmacie{
	
	private String nomMedoc ;
	private double prix ;
	private int  stock ;
	 Medicaments(String nomMed, double prix, int stock) {
		 
		 super() ;
		
		this.nomMedoc = nomMed;
		this.prix = prix;
		this.stock = stock;
	}
	public String getNomMedoc() {
		return this.nomMedoc;
	}
	public void setNom(String nomMed) {
		this.nomMedoc = nomMed;
	}
	public double getPrix() {
		return this.prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getStock() {
		return this.stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void affichage() {
		
		System.out.println() ;
		System.out.println("----------INFOS SUR LE MEDICAMENT------------") ;
		System.out.println("Medicament(s) : "+this.nomMedoc) ;
		System.out.println("Prix : "+this.prix+" FCFA");
		System.out.println("Stock(s) en Cours: "+this.stock);
		
	 

	}	

}
