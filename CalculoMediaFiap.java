package projetoVetores;
import java.util.Scanner;
public class CalculoMediaFiap {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		String[] materias = new String[] { "RES DE PROB", "ARQ E ORG DE COMP", "LAB DE PROG", "SENSORES E CIRC",
				"SIS INFO", "STORY", "WEB" };

		System.out.println("##### BEM-VINDO(A) À CALCULADORA DE MÉDIA FIAP #######");
		System.out.println();
		System.out.println();
		for (int i = 1; i < 7; i++) {

			for (int j = 1; j < 2; j++) {

				System.out.println("-------1°-SEMESTRE--------");

				System.out.println("digite a nota para o Checkpoint 1  de " + materias[i] + ":");
				double notasCP = entrada.nextDouble();

				System.out.println("digite a nota para o Checkpoint 2  de " + materias[i] + ":");
				double notasCP2 = entrada.nextDouble();

				System.out.println("digite a nota para o Sprint 1 de " + materias[i] + ":");
				double notasSprint = entrada.nextDouble();

				System.out.println("digite a nota para o Sprint 2  de " + materias[i] + ":");
				double notasSprint2 = entrada.nextDouble();

				double mediaCheckpoint = ((notasCP + notasCP2 + notasSprint + notasSprint2) / 4) * 10;
				System.out.println("*");
				System.out.println("*");
				System.out.println("*");
				System.out.println("MÉDIA DE CHECKPOINT= " + (mediaCheckpoint));

				System.out.println("digite a nota da GS " + (i) + " de " + materias[i] + ":");
				double notaGS = entrada.nextDouble();

				double mediaSem1 = (mediaCheckpoint * 0.40) + (notaGS * 0.60);
				System.out.println("*");
				System.out.println("*");
				System.out.println("*");
				System.out.println("MÉDIA SEMESTRAL= " + mediaSem1);

				for (int j1 = 1; j1 < 2; j1++) {

					System.out.println("--------2°-SEMESTRE--------");

					System.out.println("digite a nota para o Checkpoint 1  de " + materias[i] + ":");
					double CP1Sem2 = entrada.nextDouble();

					System.out.println("digite a nota para o Checkpoint 2 de " + materias[i] + ":");
					double CP2Sem2 = entrada.nextDouble();

					System.out.println("digite a nota para o Sprint 1 de " + materias[i] + ":");
					double Sprint1Sem2 = entrada.nextDouble();

					System.out.println("digite a nota para o Sprint 2 de " + materias[i] + ":");
					double Sprint2Sem2 = entrada.nextDouble();

					double media2Checkpoint = ((CP1Sem2 + CP2Sem2 + Sprint1Sem2 + Sprint2Sem2) / 4) * 10;
					System.out.println("MÉDIA DE CHECKPOINT= " + (media2Checkpoint));

					System.out.println("digite a nota da GS " + (i) + "de " + materias[i] + ":");
					double notaGS2 = entrada.nextDouble();

					double mediaSem2 = (media2Checkpoint * 0.40) + (notaGS2 * 0.60);

					System.out.println("*");
					System.out.println("*");
					System.out.println("*");
					System.out.println("MÉDIA SEMESTRAL= " + mediaSem2);

					double mediaAnual = (mediaSem1 * 0.40) + (mediaSem2 * 0.60);
					System.out.println("<><><><><>");
					System.out.println("Sua Média Anual é de = " + mediaAnual);

					System.out.println("------SITUAÇÃO: ------");
					if (mediaAnual <= 39) {

						System.out.println("REPROVADO");

					} else if (mediaAnual < 40 || mediaAnual <= 59) {

						System.out.println("RECUPERAÇÃO");

					} else {

						System.out.println("APROVADO");
					}

				}
			}
		}
		entrada.close();

	}

}
