package Exos;
import java.util.Scanner;

/*Il s’agit de calculer un tableau de valeurs en francs obtenus en convertissant les valeurs d’un autre
tableau, exprimées en euros et saisies au clavier*/

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner db = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("tapez un entier svp");
		int n = sc.nextInt(); 
		double [] tabEu = new double [n];
		double [] tabFr = new double [n];
		
		
		for ( int i = 0 ; i < n; i++ ) {
			System.out.println("tapez un nombre svp");
			 tabEu[i] = db.nextDouble();			
		}
						
		for( int z = 0; z < n; z++) {
			
			tabFr[z] = tabEu[z] / 6.556;
		}
		
		for (double y : tabFr) {
			System.out.println(y);
			}
		for (double x : tabEu) {
			System.out.println(x);
			}
	}

}
