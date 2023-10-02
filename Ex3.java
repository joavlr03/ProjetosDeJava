package projetojava;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {

		int numero=0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o numero");
		numero=entrada.nextInt();

		System.out.println("seu sucessor é:"+ (numero+1));
		System.out.println("seu antecessor é:"+ (numero-1));
		entrada.close();

	}

}
