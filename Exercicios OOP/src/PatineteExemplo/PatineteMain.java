package PatineteExemplo;

import Patinete.Patinete;

public class PatineteMain {
	
	public static void main(String[] args) {
		
		
		Patinete produtoPatinete = new Patinete();
		
		//5) Crie uma classe patinete e apresente os atributos e m�todos 
		//referentes esta classe, em seguida crie um objeto patinete, defina 
		//as instancias deste objeto e apresente as informa��es deste objeto no console.
		
		
		produtoPatinete.marca = "Centauro";
		produtoPatinete.cor = "Verde";
		produtoPatinete.preco = 150.00;


		
	    System.out.println(produtoPatinete.marca);
		
		System.out.println(produtoPatinete.cor);

		System.out.println(produtoPatinete.preco);

			
		
	}

}
