package Exos;

import java.util.Scanner;
/*L�utilisateur saisit le nombre de caract�res qu�il veut ajouter dans le tableau, l�indice � partir duquel il
veut les ins�rer et les caract�res eux-m�mes. Notez que la taille des tableaux �tant fixe en Java, on ne
peut pas r�ellement ins�rer des �l�ments en plus. Ce qu�on fera sera de cr�er un nouveau tableau en
recopiant les valeurs de l�ancien tableau et les nouvelles valeurs ins�r�es conform�ment � la demande.*/

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		char  charGamel[]  = {'a', 'b', 'c', 'd'};
		
		System.out.println("Combien voulez vous ajoutez d'�l�ments svp?");
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
