package projetojava;
import java.util.Scanner;
public class GuanabaraExercicios {

	public static void main(String[] args) {

		// formas diferentes de saida de dados 

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite o nome");
		String nome = entrada.next();
		System.out.println("digite a nota");
		float nota = entrada.nextFloat();

		System.out.printf("a nota de %s é %.2f \n",nome,nota );

		entrada.close();

	}

}
