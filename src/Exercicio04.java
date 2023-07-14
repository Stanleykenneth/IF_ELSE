import java.util.Scanner;

/*
    04 - Faça um programa que leia um número e, caso ele seja
         positivo, calcule e mostre:
         . O número digitado ao quadrado
         . A raiz quadrada do número digitado 
*/
public class Exercicio04 {
	
	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número:");
		num = ler.nextInt();
		
		if(num > 0) {
			
			int numQuad = num * num;
			System.out.println("O valor do número ao quadrado é: " + numQuad);
			
			double raiz = Math.sqrt(num);
			System.out.println("A raiz do número digitado é:" + raiz);
		}
		else {
			System.out.println("O número digitado é negativo.");
		}
		ler.close();
		
	}
}
