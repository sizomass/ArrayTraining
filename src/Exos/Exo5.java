package Exos;

import java.util.Scanner;
/*L’utilisateur saisit le nombre de caractères qu’il veut ajouter dans le tableau, l’indice à partir duquel il
veut les insérer et les caractères eux-mêmes. Notez que la taille des tableaux étant fixe en Java, on ne
peut pas réellement insérer des éléments en plus. Ce qu’on fera sera de créer un nouveau tableau en
recopiant les valeurs de l’ancien tableau et les nouvelles valeurs insérées conformément à la demande.*/

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		char  charGamel[]  = {'a', 'b', 'c', 'd'};
		
		System.out.println("Combien voulez vous ajoutez d'éléments svp?");
		int add = sc.nextInt();
		
		System.out.println("A partir de quel indice svp?");
		int indi = sc.nextInt();
			
		int charbilL = charGamel.length + add;
		
		char [] charChabil = new char [charbilL];
		
		for (int i = 0; i < indi; i++) {
			charChabil[i] = charGamel[i];
		}
				
		for ( int i = indi; i < add + 1 ; i++ ) {
			Scanner sc1 = new Scanner(System.in);						
			System.out.println("veuillez taper vos char svp");
			charChabil[i] = sc1.nextLine().charAt(0);
		}
	
		for (int i = indi + add; i < charbilL; i++)	{
			
			charChabil[i] = charGamel[i - add];
		}
		
		
		for (int i = 0; i < charChabil.length; i++) {
			System.out.println(charChabil[i]);		
		}
	}

}
