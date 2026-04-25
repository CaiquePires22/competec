import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		System.out.println("eu tenho "+ idade + " anos");
		==================================================================================================
		int quantiaAbacaxi;
		int quantiaMaca;
		int quantiaPera;
		double valorTotalCompra;
		double precoAbacaxi = 7.30;
		double precoMaca = 2.00;
		double precoPera = 4.00;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos abacaxis você comprou?");
		quantiaAbacaxi = scanner.nextInt();
		
		System.out.println("Quantas Maças você comprou?");
		quantiaMaca = scanner.nextInt();
		
		System.out.println("Quantas Peras você comprou?");
		quantiaPera = scanner.nextInt();
		
		valorTotalCompra = (quantiaAbacaxi * precoAbacaxi) + (quantiaMaca * precoMaca) + (quantiaPera * precoPera);
		
		System.out.println("O valor total da sua compra é: "+ valorTotalCompra);
		=============================================================================================
		int minhaIdade = 17;
		int idadeProfessor;
		boolean souMaisVelho;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos anos o professor tem?");
		idadeProfessor = scanner.nextInt();
		
		souMaisVelho = minhaIdade > idadeProfessor;
		
		if(souMaisVelho == true){
		    System.out.println("Eu sou mais velho que o professor");
		}else{
		    System.out.println("O professor é mais velho que eu ou temos a mesma idade");
		}
		=============================================================================================
		
		boolean estaChovendo = false;
		boolean estaRelampejando = false;
		
		if(estaChovendo == false && estaRelampejando == false){
		    System.out.println("Não vou sair de casa hoje");
		}else{
		    System.out.println("Vou sair de casa hoje");
		}
		
		boolean temMacarrãoHoje = false;
		boolean temEstrogonofeHoje = true;
		
		if(temMacarrãoHoje == true || temEstrogonofeHoje == true){
		    System.out.println("EStou muito feliz!");
		}else{
		    System.out.println("Queria macarrão ou strogonofe.");
		}
		================================================================================================
		*/
		
		int IdadedoA = 19;
		int IdadedoB = 19;
		boolean mesmaIdadeAmaisDezoito = IdadedoA == IdadedoB && IdadedoA > 18;
		
		boolean idadeDiferenteBmenorDe12 = IdadedoA != IdadedoB && IdadedoB < 12;
		
		System.out.println(mesmaIdadeAmaisDezoito + " " + idadeDiferenteBmenorDe12);
	}
}
