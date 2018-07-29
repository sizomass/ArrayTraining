package Exos;

import java.util.Scanner;


/*Ecrivez un programme qui saisit un nombre n au clavier et qui calcule un tableau dont le plus grand
indice est n et dans lequel il y a, pour chaque case d’indice i, la somme des entiers compris entre 0 et i
B. Dans cette première version du programme, chaque somme est calculée indépendamment. On peut
optimiser les calculs en considérant que pour chaque case (sauf la première), il suffit d’ajouter la valeur
de l’indice à la valeur de la case précédente pour obtenir le résultat recherché.*/

public class Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre entier");
		int n = sc.nextInt();
		
		int []tab = new int[n + 1];
		
		for (int x = 0; x < n; x++) {
			System.out.println("Entrez un nombre entier encore et encore");
			tab[x] = sc.nextInt();
			
		}
		
		int sum = 0;
		for (int i = 0; i < tab.length; i++) {
			
			sum = sum + tab[i];
		}
		
		int sumEach = 0;
		for (int a = 1; a < tab.length; a++) {
			
			sumEach = tab[a] + tab[a - 1];
			System.out.println(sumEach);
		}
	}

}
