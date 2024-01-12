package com.pharmaGabon.nzati;
import java.util.Scanner ;

public class GestionPharmacie {
	private static Scanner sc= new Scanner(System.in) ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client[] clients= new Client [2];
		Medicaments[] medicaments= new Medicaments[2] ;

		clients[0]= new Client("UMBA NZATI",9000.36) ;
		clients[1]= new Client("NZATI DOUMBI EVANS",45000.36);

		medicaments[0]= new Medicaments("TRAMADOL",450.89,9);
		medicaments[1]= new Medicaments("ASPIRINE",4500.89,9);
			

		
		
		/*clients[1].affichage();
		medicaments[1].affichage();*/

		//lireMedicament(medicaments) ;
		int choix=0 ;




		do {  
			choix=menu() ;
			System.out.println(" ----------PHARMACIE----------------------");
			switch(choix) {



			case 1:

				System.out.println("-----------ACHATS---------") ;
				achats(clients,medicaments);
				break;
			case 2 :
				System.out.println("-------------Approvisionnements------") ;
				approvisionnements(medicaments) ;
				break ;
			case 3:
				System.out.println("-----------Affichage----------") ;
				affichage(clients,medicaments) ;

				break ;
			case 4:
				Quitter() ;
				break;

			}

		}while(choix<4) ;
	}


	static int menu() {

		int choix= 0;

		System.out.println();
		System.out.println();
		System.out.println("1.Achat de médicaments ");
		System.out.println("2.Approvisionnement de médicaments");
		System.out.println("3.Etats des stocks et de crédits ");
		System.out.println("4.Quitter ");
		while((choix)!=1 && (choix!=2)&& (choix!=3)&& (choix!=4)) {
			choix=sc.nextInt() ;
			sc.nextLine();

		}
		return choix ;
	}
	static void affichage(Client client[], Medicaments medicament[] ) {
		int i ;


		System.out.println(" Affichage des crédits ");
		for(i= 0 ; i<client.length;i++) {

			System.out.println("credit du client "+client[i].getNom()+": "+client[i].getCredit()+" FCFA") ;

		}

		System.out.println("Affichage des stocks ") ;

		for(i=0; i < medicament.length;i++) {

			System.out.println(" Stock du medicament "+medicament[i].getNomMedoc()+" : "+medicament[i].getStock());		
		}	




	}
	static void Quitter() {

		System.out.println("PROGRAMME TERMINE !") ;



	}

	static Client lireClient(Client client[]) {

		int i;
		String nom ;
		boolean trouve= false ;
		Client c= null ;

		do {
			System.out.println("VEUILLEZ RENTRER VOTRE NOM : ") ;
			nom=sc.nextLine() ;
			for(i=0; i<client.length;i++) {

				if(nom.equals(client[i].getNom())) {
					trouve= true ;
					c=client[i] ;
					System.out.println("CLIENT(E) TROUVE(E) !") ;

				}
			}

			if(!trouve) {

				System.out.println("CLIENT(E) INCONNU(E) !") ;

			}
		}while(!trouve) ;

		return c ;



	}


	static Medicaments lireMedicament(Medicaments medicaments[]) {
		String medoc ;
		boolean trouve= false ;
		Medicaments m =null ;
		int i ;
		do {
			System.out.println("VEUILLEZ RENTRER LE NOM DU MEDICAMENT : ") ;
			medoc=sc.next() ;


			for(i= 0 ; i<medicaments.length;i++) {

				if(medoc.equals(medicaments[i].getNomMedoc())) {
					trouve= true ;
					m=medicaments[i] ;

					System.out.println("MEDICAMENT TROUVE ! ") ;


				}
			}

			if(!trouve) {
				System.out.println("MEDICAMENT NON  TROUVE") ;


			}
		}while(!trouve) ;

		return m ;

	}
	static double lirePaiement(double paye) {

		System.out.println("montant du paiement : ") ;
		paye=sc.nextDouble();
		sc.nextLine() ;
		return paye ;


	}
	static void achats(Client clients[] , Medicaments medicaments[]) {

		Client client=lireClient(clients) ;/* on initialise une variable de type Client pour pouvoir recuperer la valeur de retour de la fonction lireClient
		qui est egalement du meme type */

		Medicaments medicament=lireMedicament(medicaments) ;/* on initialise une variable de type Medicaments pour pouvoir recuperer la valeur de retour de la fonction lireMedicament
		qui est egalement du meme type */

		double prix=0.0;
		double resPrix=lirePaiement(prix) ;

		System.out.println("Quantité  : ") ;
		int quantite=sc.nextInt() ;
		int i;
		if (quantite <=medicament.getStock()) {
			client.setCredit(client.getCredit()-resPrix);
			medicament.setStock(medicament.getStock()-quantite);
		}
		else {
			System.out.println("Quantite insufisante ! ") ;
		}
	}


	static void approvisionnements(Medicaments[] medicaments) {
		
		Medicaments medicament=lireMedicament(medicaments) ;
		
		System.out.println(" Donner la Quantité  : ") ;
		int quantite=sc.nextInt();
		
		medicament.setStock(medicament.getStock()+quantite);
	}
}
