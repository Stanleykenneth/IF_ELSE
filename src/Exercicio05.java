import java.util.Scanner;

/*
   05 - Faça um programa que receba um número inteiro e verifique
        se este número é par ou impar. 
*/
public class Exercicio05 {
	
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			int num;
			System.out.println("Digite um número:");
			num = ler.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("O número digitado é um número par!");
			}
			else {
				System.out.println("O número digitado é um número impar!");
			}
			ler.close();
					
		}
}
