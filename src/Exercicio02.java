import java.util.Scanner;

/*
   02- Leia um número fornecido pelo usuário. se o número for positivo
       calcule a raiz quadrada do número. Se o número for negativo, mostre
       a mensagem dizendo número inválido.
 */
public class Exercicio02 {
 
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		if(num > 0) {
			double raiz = Math.sqrt(num);
			
			System.out.println("A raiz quadrada de " + num + " é " + raiz);
		} 
		 else if(num < 0) {
			System.out.println("Número inválido");
		} 
		ler.close();
	}
}
