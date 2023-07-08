import java.util.Scanner;

/*
   01 - Faça um programa que receba dois números e mostre qual deles é o maior.
*/
public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro número:");
		num1= ler.nextInt();
		
		System.out.println("Digite o Segundo número:");
		num2= ler.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro número é maior que o segundo.");
		}
		else {
			System.out.println("O segundo número é maior que o primeiro.");
		}
		
		ler.close();
	}
}
