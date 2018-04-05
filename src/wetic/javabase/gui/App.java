package wetic.javabase.gui;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	//	System.out.println("Veuillez saisir un mot: ");
	//	String str = sc.nextLine();
		
	//	System.out.println("Vous avez saisi: " + str);
		
	//	for (int i = 0; i < 25; i++) {
	//		System.out.println("Indice: " +i);
	//	}
	//			int i=0;
	//			while (i < 25) {
	//				System.out.println("Indice: " +i);
	//				i++;
	//	
	//	}
		/*  exo 1.1
		int cpt =1;
		int x;
		x = (int)(Math.random() * 1000);
	    // System.out.println(x);   
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez Enter un nombre entre 0 et 1000 : ");		
		int nb = sc.nextInt();
		while (nb != x) {			
			if (nb > x  ) {
					System.out.println("Trop grand : ");
			}
				else{
					System.out.println("Trop petit : ");	
				}
				System.out.println("Veuillez Enter un nombre entre 0 et 1000 : ");
				nb = sc.nextInt();
				cpt++;
			}			
			System.out.println("Vous avez trouvé le  nb " + x + " en " + cpt +  " coups");
		*/	
		int tab[];
		tab =  new int[5];
		for (int i = 0; i < 5; i++) {
				System.out.println("Saisir Indice: " +i);
				tab[i] = sc.nextInt();				
		}
		int somme=0;
		for (int i = 0; i < 5; i++) {
			System.out.println(tab[i]+ " " +i);
			somme = somme + tab[i] ;			
	    }
		System.out.println( "Somme :  " + somme);		
		}
		
	
	
}