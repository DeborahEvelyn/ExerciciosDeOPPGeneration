package FuncionarioExemplo;

import Funcionario.Funcionario;

public class FuncionarioMain {

	public static void main(String[] args) {
		
		Funcionario funcionarioPerfil = new Funcionario();
		
		
		//4) Crie uma classe funcion�rio e apresente os atributos e m�todos 
        //referentes esta classe, em seguida crie um objeto funcion�rio, defina 
       // as instancias deste objeto e apresente as informa��es deste objeto no console.
		
		funcionarioPerfil.nome = "Bruno";
		funcionarioPerfil.endereco = "Rua 9";
		funcionarioPerfil.matricula = "9737";
		funcionarioPerfil.idade = 25;
		
	    System.out.println(funcionarioPerfil.nome);
		
		System.out.println(funcionarioPerfil.endereco);

		System.out.println(funcionarioPerfil.matricula);

		System.out.println(funcionarioPerfil.idade);

	}

}
