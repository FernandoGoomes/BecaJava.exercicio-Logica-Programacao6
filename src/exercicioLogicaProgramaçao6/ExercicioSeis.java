package exercicioLogicaPrograma�ao6;
import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     
	    System.out.print(
	      "Este programa permite calcular o MDC\n");
	    System.out.print("Informe o primeiro n�mero: ");
	    int x = sc.nextInt();
	 
	    System.out.print("Informe o segundo n�mero: ");
	    int y = sc.nextInt();
	 
	    System.out.println("\nO M�ximo Divisor Comum de "
	      + x + " e " + y + " � " + mdc(x, y));
	    
	    sc.close();
	  }
	 
	  public static int mdc(int a, int b){
	    int resto;
	 
	    while(b != 0){
	      resto = a % b;
	      a = b;
	      b = resto;
	    }
	 
	    return a;
	  }

	}


