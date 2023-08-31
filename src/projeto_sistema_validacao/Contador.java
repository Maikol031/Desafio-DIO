package projeto_sistema_validacao;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		MetodoContador metodo1 = new MetodoContador();
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parametro: ");
		int param1 = terminal.nextInt();
		System.out.println("Digite o segundo: ");
		int param2 = terminal.nextInt();
		
		
	
		try {
			metodo1.contador(param1, param2);
			
			
			
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
			System.err.println("O primeiro parametro é maior que o segundo parametro!");
		}
		
		terminal.close();
	}
	
	
		
	
}
