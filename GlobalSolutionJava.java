package projetojava;
import java.util.Scanner;
public class RascunhoTeste {

	public static void main(String[] args) {
		  
		 {
		     {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o número de famílias agricultoras: ");
		        int numFamilias = scanner.nextInt();
		        scanner.nextLine(); 

		        String familiaMaiorFaturamento = "";
		        double maiorFaturamento = 0;

		        String familiaMenorLucro = "";
		        double menorLucro = Double.MAX_VALUE;

		        double somaInvestimento = 0;
		        double somaFaturamento = 0;

		        for (int i = 1; i <= numFamilias; i++) {
		            System.out.println("Dados da família " + i + ":");

		            System.out.print("Nome da família: ");
		            String nomeFamilia = scanner.nextLine();

		            System.out.print("Investimento mensal recebido (em reais): ");
		            double investimento = scanner.nextDouble();
		            scanner.nextLine(); 

		            System.out.print("Faturamento mensal das vendas dos alimentos cultivados: ");
		            double faturamento = scanner.nextDouble();
		            scanner.nextLine(); 

		            double lucro = faturamento - investimento;

		            somaInvestimento += investimento;
		            somaFaturamento += faturamento;

		            if (faturamento > maiorFaturamento) {
		                maiorFaturamento = faturamento;
		                familiaMaiorFaturamento = nomeFamilia;
		            }

		            if (lucro < menorLucro) {
		                menorLucro = lucro;
		                familiaMenorLucro = nomeFamilia;
		            }
		        }

		        double percentualLucro = ((somaFaturamento - somaInvestimento) / somaFaturamento) * 100;

		        System.out.println("------------------------------");
		        System.out.println("Família com maior faturamento: " + familiaMaiorFaturamento + " - Faturamento: R$" + maiorFaturamento);
		        System.out.println("Família com menor lucro: " + familiaMenorLucro + " - Lucro: R$" + menorLucro);
		        System.out.println("Soma dos investimentos de todas as famílias: R$" + somaInvestimento);
		        System.out.println("Percentual de lucro sobre as vendas de todas as famílias: " + percentualLucro + "%");

		        scanner.close();
		    }
		}

  
	



