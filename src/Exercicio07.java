import java.util.Scanner;

/*
   07 - Faça um programa que recebe dois números e mostre o maior.
     	Se por acaso, os dois números forem iguais, imprima a mensagem
     	"números iguais".
*/
public class Exercicio07 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro número é maior que o segundo.");
		}
		else if(num1 < num2) {
			System.out.println("O segundo número é maior que o primeiro.");			
		}
		else {
			System.out.println("Números iguais!");
		}
		ler.close();
	}
}
