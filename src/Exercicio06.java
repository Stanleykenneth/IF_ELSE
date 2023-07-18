import java.util.Scanner;

/*
    06 - Escreva um programa que, dados doi números inteiros, mostre na
         tela o maior deles, assim como a diferença existente entre ambos. 
*/
public class Exercicio06 {
	
	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		
		if (num1 > num2) {
			
			int diferenca;
			diferenca = num1 - num2;
			
			System.out.println("O primeiro número é maoir que o segundo numero digitado. " + " E sua diferença é de: " + diferenca + " números.");
			
		}
		else {
			
			int diferenca1;
			diferenca1 = num2 - num1; 
			System.out.println("O segundo número digitado é maior que o primeiro. E sua diferença é de: " + diferenca1 + " números.");
			
		}
		ler.close();
	}
}
