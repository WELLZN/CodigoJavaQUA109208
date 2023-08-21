package principal;
import java.util.Scanner;
public class Maiornumero3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("escreva one number: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("escreva other number:");
		int numero2 = scanner.nextInt();
		
		System.out.println("escreva oto number:");
		int numero3 = scanner.nextInt();

		if (numero1> numero2) {
			System.out.println("primeiro numero informado é maior" );
		}
		
		else if (numero2 > numero3){
		System.out.println("O segundo numero informado é maior");
	
		}
		if (numero1> numero2) {
			System.out.println("primeiro numero informado é maior" );
		}
		
		else if (numero2 > numero3){
		System.out.println("O primeiro numero informado é maior");
		}
	}	
}	