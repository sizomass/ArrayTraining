package Exos;

import java.util.Scanner;


/*Ecrire un programme qui saisit 10 caract�res au clavier, puis ensuite, calcule le nombre de majuscules,
et le nombre de lettres dans ce tableau. Un caract�re n�est pas forc�ment une lettre : ce peut �tre un chiffre,
un signe de ponctuation, un caract�re sp�cial.*/

public class Exo1 {
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("S'il vous plait entrez une string de 10 caract�res");
		String input = sc.nextLine();
		
		char [] tab = new char [10]; 
		
		for (int i = 0;  i < 10; i++) {
			
		tab[i] = input.charAt(i);	
		
		System.out.println(Character.isUpperCase(tab[i]));
		System.out.println(Character.isLetter(tab[i]));	
		}
		
		int y;
		 for (y = 0; y < input.length(); y ++ ) {
			 if ( tab[y] >= 'a' && tab[y] <= 'z') {
								 
				 System.out.println(tab[y]);				 
			 }
			 
			 
		 }
		 int z;
		 for (z = 0; z < input.length(); z++) {
			if (tab[z] >= 'A' && tab[z]  <= 'Z'){
				
				System.out.println(tab[z]);
			}
			
		}
	}

}
