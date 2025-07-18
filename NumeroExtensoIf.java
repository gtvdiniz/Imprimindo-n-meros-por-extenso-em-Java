import java.util.*;
public class NumeroExtensoIf {
	//Exercício 5
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número de 1 - 10: ");
		int num = sc.nextInt(); 
		
		
		if (num == 1)
			System.out.println("Um");
		
		else if (num == 2)
			System.out.println("Dois");
		
		else if (num == 3)
			System.out.println("Três");
		
		else if (num == 4)
			System.out.println("Quatro");
		
		else if (num == 5)
			System.out.println("Cinco");
		
		else if (num == 6)
			System.out.println("Seis");
		
		else if (num == 7)
			System.out.println("Sete");
		
		else if (num == 8)
			System.out.println("Oito");
		
		else if (num == 9)
			System.out.println("Nove");
		
		else if (num == 10)
			System.out.println("Dez");
		
		else 
			System.out.println("Número Inválido");
	}

}
