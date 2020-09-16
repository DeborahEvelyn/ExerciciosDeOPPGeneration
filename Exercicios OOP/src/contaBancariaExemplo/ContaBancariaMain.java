package contaBancariaExemplo;

import contaBancaria.ContaBancaria;

public class ContaBancariaMain {
	
	public static void main(String[] args)
	{
		ContaBancaria conta = new ContaBancaria();
		
		/*6) Crie uma classe conta bancaria e apresente os atributos 
		 * e métodos referentes esta classe, em seguida crie um objeto 
		 * conta bancaria, defina as instancias deste objeto e apresente 
		 * as informações deste objeto no console.
		 */
		
		conta.nomeConta = "Luiza";
		conta.valor = 700;
		conta.codigo = 83622;
		
		System.out.println(conta.nomeConta);
			
		System.out.println(conta.valor);

		System.out.println(conta.codigo);
		
		
	}

}
