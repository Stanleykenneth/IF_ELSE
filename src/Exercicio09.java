import java.util.Scanner;

/*
  	09 - Leia um salário de um trabalhador e o valor da prestação de uma emprestimo.
  		 Se a prestação for maior que 20% do salário imprima: 
  		 "EMPRÉSTIMO NÃO CONCEDIDO",
  		 Caso contrário imprima: "EMPRÉSTIMO CONCEDIDO" 	
  	     
*/
public class Exercicio09 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double salario;
		double prestacao;
		double Emprestimo;
		
		
		System.out.println("Digite o valor do seu salário: ");
		salario = ler.nextDouble();

		System.out.println("Digite valor da prestação do empréstimo:");
		prestacao = ler.nextDouble();

		System.out.println("Digite  Prestação");
		Emprestimo = ler.nextInt();

		Emprestimo = salario * 0.2;
        
		if(prestacao > Emprestimo) {
			System.out.println("Emprestimo não concedido!");
		}
		else {
			System.out.println("Emprestimo concedido!");
		}
		ler.close();
	}
}
