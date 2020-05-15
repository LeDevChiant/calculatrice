package fr.ledevchiant.calculatrice;

import java.util.Scanner;

import fr.ledevchiant.calculatrice.signes.Addition;

public class Initialisation {

	@SuppressWarnings({ "resource" })
	public static void init() {
		Scanner entre = new Scanner(System.in);
		System.out.println("Bienvenue sur le programme calculatrice.");
		System.out.println("que voulez vous faire : Addition, Soustraction ?");
		String saisi1 = entre.nextLine();
		char saisi = saisi1.charAt(0);
		if (saisi == 'a' || saisi == 'A') {
			
		}
		else{
			System.out.println("FAILED");
		}
	}

}
