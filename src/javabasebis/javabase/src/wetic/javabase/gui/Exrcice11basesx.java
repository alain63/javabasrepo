package javabasebis.javabase.src.wetic.javabase.gui;

import java.util.Scanner;

import wetic.javabase.bal.MyService;

public class Exrcice11basesx {

	public static void main(String[] args) {

		// 1. Declarer les variables
		int nombreADevine;
		int nombreChoisi;
		int nombreEssai;
		Scanner sc;
		MyService myService = new MyService();
		// 2. Initialiser les variables
		nombreEssai = 0;
		sc = new Scanner(System.in);
		
		
		nombreADevine = (int) (Math.random() * 1000);
		
		System.out.println("Bonjour! " + nombreADevine);
		
		// Ce processus va s'�xecuter tant que le nomre 
		// que l'user reseigne n'est celui g�n�r�
		// quand l'user trouve enfin le nombre
		// Le system lui affiche un message pour le lui signalier
		do {
			//Appeler la methode saisirAndDevinerNombre � partir de la classe 
			//MyService
			nombreChoisi =  MyService.saisirAndDevinerNombre(nombreADevine, sc);
			// Incrementer le nombre d'essai
			nombreEssai++;
			//Tester � la fon de la boucle si l'user � trouv� le nombre recherch�
		} while (nombreADevine != nombreChoisi);
		System.out.println("Bravo, vous avez trouv� en "
				+ nombreEssai +" essai(s)!");
	}
}
