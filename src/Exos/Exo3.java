package Exos;

import java.util.Scanner;

public class Exo3 {

	/*Ecrivez un programme qui saisit au clavier 4 valeurs bool�ennes (true ou false en Java) et qui
	affiche ensuite le r�sultat de l�op�ration et sur toutes ces valeurs ainsi que le r�sultat de l�op�ration
	ou sur toutes ces valeurs*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);

		boolean [] boolDeux = new boolean[4];

		for (int x = 0; x < 4; x ++) {

			boolDeux[x] = sc.nextBoolean();

		}
		
		boolean lie = false;
		boolean truth = true;

		for (boolean bool : boolDeux) {

			System.out.println(bool && truth);
		}

		for (boolean boole : boolDeux) {

			System.out.println(boole || lie);
			
		}
	}

}
