import java.util.Scanner;

/*
    10 - Faça um programa que receba o sexo de uma pessoa, calcule e mostre
         seu peso ideal, utilizando, as seguintes formulas
         (h correponde a altura):
         
            . HOMENS (72.7 * h) - 58
            . MULHERES (62,1 * h) - 44,7
*/
public class Exercicio10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String sexo;

		System.out.println("Didigite o seu sexo (M ou F):");
		sexo = ler.nextLine();

		if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Digite a altura (em metros):");
			double h = ler.nextDouble();
			double pesoIdealhomens = (72.7 * h) - 58;
			System.out.println("Peso ideal para sua altura é:" + Math.round(pesoIdealhomens));
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Digite a altura (em metros):");
			double h = ler.nextDouble();
			double pesoIdealMulheres = (62.1 * h) - 44.7;
			System.out.println("Peso ideal para sua altura é:" + Math.round(pesoIdealMulheres));
		} else {
			System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
		}

		ler.close();
	}
}
