/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;


public class Main
{
    public static void main(String[] args){
       
        double abacaxi = 8.5;
        double goiaba = 2.0;
        double laranja = 1.3;
        double valorTotal;
        
        System.out.println("Qual produto deseja comprar?");
        Scanner scanner = new Scanner(System.in);
        int codigoProduto = scanner.nextInt();
       /* if(codigoProduto == 1) {
            System.out.println("O preço do Abacaxi é: " + abacaxi);
            System.out.println("Quantas unidades deseja?: ");
            double quantidadeFruta = scanner.nextDouble();
            valorTotal = abacaxi * quantidadeFruta;
            System.out.println("O valor da sua compra é: " + valorTotal);
        }else if(codigoProduto == 2) {
            System.out.println("O preço da goiaba é: " + goiaba);
            System.out.println("Quantas unidades deseja?: ");
            double quantidadeFruta = scanner.nextDouble();
            valorTotal = goiaba * quantidadeFruta;
            System.out.println("O valor da sua compra é: " + valorTotal);
        }else if(codigoProduto == 3){
            System.out.println("O preço da laranja é: " + laranja);
            System.out.println("Quantas unidades deseja?: ");
            double quantidadeFruta = scanner.nextDouble();
            valorTotal = laranja * quantidadeFruta;
            System.out.println("O valor da sua compra é: " + valorTotal);
        }else{
            System.out.println("Codigo invalido, tente novamente");
        }   */
        double quantidadeFruta;
        switch (codigoProduto) {
            case 1:
                System.out.println("O preço do Abacaxi é: " + abacaxi);
                System.out.println("Quantas unidades deseja?: ");
                quantidadeFruta = scanner.nextDouble();
                valorTotal = abacaxi * quantidadeFruta;
                System.out.println("O valor da sua compra é: " + valorTotal);
                break;
                
            case 2:
                System.out.println("O preço da goiaba é: " + goiaba);
                System.out.println("Quantas unidades deseja?: ");
                quantidadeFruta = scanner.nextDouble();
                valorTotal = goiaba * quantidadeFruta;
                System.out.println("O valor da sua compra é: " + valorTotal);
                break;
                
            case 3:
                System.out.println("O preço da laranja é: " + laranja);
                System.out.println("Quantas unidades deseja?: ");
                quantidadeFruta = scanner.nextDouble();
                valorTotal = laranja * quantidadeFruta;
                System.out.println("O valor da sua compra é: " + valorTotal);
                break;
            
            default:
                 System.out.println("Codigo invalido, tente novamente");
        }
        
   
   
    }
	
	
}
