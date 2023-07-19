import java.util.Scanner;

/*
   08 - Faça um programa que leia 2 notas de um aluno, verifique se as notas
    	são válidas e exiba na tela a média destas notas. Uma nota válida deve
    	ser, obrigatoriamente entre 0.0 e 10.00, onde cada nota não possua um valor
    	válido, este fato deve ser informado ao usuário e o programa termina.
*/
public class Exercicio08 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double nota1;
		double nota2;
		double media;

		System.out.println("Digite o valor da primeira nota: ");
		nota1 = ler.nextDouble();

		System.out.println("Digite o valor da segunda nota: ");
		nota2 = ler.nextDouble();

		if (nota1 > 0.0 & nota1 < 10.00 & nota2 > 0.0 & nota2 < 10.00) {

			media = (nota1 + nota2) / 2;
			System.out.println("A media das notas é " + media);

		} else if (nota1 < 0 & nota2 < 0) {

			System.out.println("Notas inválidas");
			System.out.println("Fim!");
		}
		ler.close();
	}
}
