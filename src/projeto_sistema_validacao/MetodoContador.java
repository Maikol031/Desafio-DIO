package projeto_sistema_validacao;

public class MetodoContador {

	
	public void contador(int parametro1, int parametro2) throws ParametrosInvalidosException{
		if(parametro1 > parametro2) {
			throw new ParametrosInvalidosException();
		}else {
		
		
		int contagem = parametro2 - parametro1;
		
		for(int i = 1; i <=contagem; i++) {
			System.out.println("Imprimindo o número "+ i);
		
		}
		}
}
	
	
}
