import java.util.Scanner;

/*
    03 - Leia um número real. Se o número for positivo imprima a raiz quadrada
         Do contrário imprima o número ao quadrado. 
*/
public class Exercicio03 {
		
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número:");
		num = ler.nextInt();
		
		if(num > 0 ) {
			double raiz = Math.sqrt(num);
			System.out.println("A raiz quadrada de " + num + " é " + raiz);
		}else if(num < 0 ) {
			num = num* num;
			System.out.println("O restultado é " + num );			
		}
		ler.close();
	}
}
