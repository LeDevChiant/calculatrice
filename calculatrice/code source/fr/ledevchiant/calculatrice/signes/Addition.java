package fr.ledevchiant.calculatrice.signes;

import java.util.ArrayList;
import java.util.Scanner;
//class qui permet de faire une addition//



// saisi1 va servir a recuperer l'entrée texte saisi lui va encrer la valeur dans la variable saisi  //

// il n'y a pas de récupérateur pour une entrée de char donc, on fais un saisiString1 pour ensuite le 
// transformer en saisiString


public class Addition {
	
	//les variables//
	static
	ArrayList<Float> liste = new ArrayList<Float>();
	static float resultat;
	static Scanner saisi1 = new Scanner(System.in);
	public static void init() {
		System.out.println("Addition : Choisir le premier nombre de l'addition : ");
		float saisiInt = saisi1.nextFloat();
		saisi1.nextLine();
		//implementation du float//
		liste.add(saisiInt);
		creationliste();
	}
	
	
	private static void creationliste() {
		String saisiString1 = new String();
		System.out.println("ajouter un autre nombre ? O/N");
		saisiString1 = saisi1.nextLine();
		
		switch (saisiString1) {
			case "oui":
				System.out.println("Addition : Choisir le nombre a ajouter : ");
				float saisiInt = saisi1.nextFloat();
				saisi1.nextLine();
				liste.add(saisiInt);
				creationliste();
			    break;
			case "non":
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Résultat : ");
				System.out.println("    ");
				for(int i = 0; i<liste.size(); i++) {
					System.out.print(liste.get(i));
					System.out.print(" + ");
				}
				for(int i = 0; i<liste.size(); i++) {
					resultat = liste.get(i) + resultat;
				}
				System.out.print(" = " + resultat);
				break;
			default:
				System.out.println("erreur");
			}
		}
		
	 }
