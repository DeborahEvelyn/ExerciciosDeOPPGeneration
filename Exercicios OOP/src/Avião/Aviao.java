package Avião;

public class Aviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//2) Crie uma classe avião e apresente os atributos e métodos 
		//referentes esta classe, em seguida crie um objeto avião, defina 
		//as instancias deste objeto e apresente as informações deste objeto no console.
		
		ProjetoAviao aviao = new ProjetoAviao();
		
		aviao.cor = "amarelo";
		aviao.modelo = "Boeing";
		aviao.codigo = 777;
		aviao.marca = "TAM";
		
		System.out.println(aviao.cor);
		
		System.out.println(aviao.modelo);

		System.out.println(aviao.codigo);

		System.out.println(aviao.marca);

		
		
		
		
		
	}

}
