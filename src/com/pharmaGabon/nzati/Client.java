package com.pharmaGabon.nzati;

public class Client {
	
	private String nomClient ;
	 private double credit ;
	
	
	
	Client(String nomCli, double cred){
		
		this.nomClient=nomCli;
		this.credit=cred ;
		
}



	public String getNom() {
		return this.nomClient;
	}



	public void setNom(String nomCli) {
		this.nomClient = nomCli;
	}



	public double getCredit() {
		return this.credit;
	}



	public void setCredit(double credit) {
		this.credit = credit;
	}
	
	public void affichage() {
		System.out.println() ;
		System.out.println("------INFOS SUR LE CLIENT----------------") ; 
		System.out.println("Nom : "+this.nomClient) ;
		System.out.println("Crédit(s) : "+this.credit+" FCFA") ;
	
}
	
	
}