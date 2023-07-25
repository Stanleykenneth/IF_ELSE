import java.util.Scanner;

/*
    11 - Escreva um programa que leia um número inteiro maior do que zero e devolva,
    	 na tela, a soma de todos os seus algoritmos. Por exemplo, ao número 251
    	 corresponderá o valor 8(2 +5+1).Se o número não for maior que zero, o programa
    	 terminará com a mensagem "Número inválido!". 
          
*/
public class Exercicio11 {
		
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número:");
		num = ler.nextInt();
		
		if(num <= 0) {
			 System.out.println("Número inválido!");
		}
		else {
			int soma = 0;
			int numSoma = num;
			
			while(numSoma > 0) {
				int digito = numSoma % 10;
				soma += digito;
				numSoma /= 10;
			}
			
			System.out.println("A soma dos digitos de " + num + " é: " + soma );
		}
		
		ler.close();
	}
	
}
