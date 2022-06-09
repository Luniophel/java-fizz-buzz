package jana60;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		/*
		 * Consegna base:
		 * Stampa numeri da 1 a 100.
		 * Se multiplo di 3, stampa Fizz
		 * Se multiplo di 5, stampa Buzz
		 * Se multiplo di entrambi, stampa FizzBuzz
		 * 
		 * BONUS:
		 * Estremo inferiore = 1
		 * Prendi numero dall'utente per l'estremo superiore
		 * 	Verifica se numero è compreso tra 1 e 200, estremi esclusi
		 * 	Se numero non valido, ripeti iterazione
		 * 	Se numero valido, vai avanti
		 * Se multiplo di 3, stampa Fizz
		 * Se multiplo di 5, stampa Buzz
		 * Se multiplo di entrambi, stampa FizzBuzz
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		//Le mie variabili
		int finoANum;
		boolean vaiAvanti;
		
		//Richiesta input all'utente
		System.out.println("Ciao! Conosci FizzBuzz? Dimmi fino a che numero devo contare!" + "\n" + "Dimenticavo: posso contare solo fino a 199." + "\n");
		System.out.print("Conta fino a: ");
		finoANum = scan.nextInt();
		
		//Controlla se il numero è valido, se non valido ripeti
		while(finoANum <= 1 || finoANum >= 200) {
			System.out.println("Hai inserito un numero non valido. Ritenta!");
			finoANum = scan.nextInt();
		}
		
		System.out.println("Conterò fino a " + finoANum + ". Pronto? Cominciamo!");
	}

}
