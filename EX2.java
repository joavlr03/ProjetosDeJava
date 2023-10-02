package projetojava;
import java.util.Scanner;
public class EX2 {

	public static void main(String[] args) {

		int candidato1=0,candidato2=0,candidato3=0,candidato4=0,voto=0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Faça seu voto:");
		voto = entrada.nextInt();


		for (int i = 0; i < 1; i++);

		if (voto == 1) {

			candidato1++;
		}

		else if (voto == 2) {

			candidato2++;
		}

		else if (voto == 3) {

			candidato3++;
		}

		else if (voto == 4) {

			candidato4++;
		}


		System.out.println("o tatal de votos do candidato 1 é:"+ candidato1);
		System.out.println("o total de votos do candidato 2 é:"+ candidato2);
		System.out.println("o total de votos do candidato 3 é:"+ candidato3);
		System.out.println("o total de votos do candidato 4 é:"+ candidato4);
		System.out.println("");
		System.out.println();
		System.out.println();
		entrada.close();
	}
}
