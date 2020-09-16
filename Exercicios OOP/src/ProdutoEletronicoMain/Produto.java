package ProdutoEletronicoMain;

import ProdutoEletronico.ProdutoExemplo;

public class Produto {

	public static void main(String[] args) {
		
		/*3) Crie uma classe produto eletrônico e apresente os 
		 * atributos e métodos referentes esta classe, em seguida 
		 * crie um objeto produto eletrônico, defina as instancias 
		 * deste objeto e apresente as informações deste objeto no console.
		 */
		
		
		ProdutoExemplo produto = new ProdutoExemplo();
		
		produto.codigo= 4954;
		produto.cor = "preto";
		produto.marca = "Marini";
		produto.modelo = "Gaviao";
		
	    System.out.println(produto.codigo);
		
		System.out.println(produto.cor);

		System.out.println(produto.marca);

		System.out.println(produto.modelo);


	}

}
