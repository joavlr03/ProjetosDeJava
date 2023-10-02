package projetojava;
import java.util.Scanner;
public class Exerciciolista {
	public static void main(String[] args) {


		int idade = 0, faixa1 = 0, faixa2=0, faixa3=0, faixa4=0, faixa5=0;
		Scanner entrada = new Scanner(System.in);



		for (int i = 0; i < 20; i++) {



			System.out.println("Pessoa " + (i+1) + " Digite sua idade ");
			idade = entrada.nextInt();

			if (idade <= 15) {
				faixa1 ++;
			}
			else if (idade <= 30) {
				faixa2++;
			}
			else if (idade <= 45) {
				faixa3++;
			}
			else if (idade <=60) {
				faixa4++;                
			}
			else {
				faixa5++;
			}        

		}
		System.out.println("Quantidade de pessoas na Faixa 1 " + faixa1);
		System.out.println("Quantidade de pessoas na Faixa 2 " + faixa2);
		System.out.println("Quantidade de pessoas na Faixa 3 " + faixa3);
		System.out.println("Quantidade de pessoas na Faixa 4 " + faixa4);
		System.out.println("Quantidade de pessoas na Faixa 5 " + faixa5);

		System.out.println("A porcentagem de pessoas na faixa 1 é :");
		System.out.println((double)faixa1/20*100);
		entrada.close();
		//Estou convertendo a quantidade da faixa1 para double 
		//pois o resultado da divisão pode ser decimal

	}
}

