package FuncionarioExemplo;

import Funcionario.Funcionario;

public class FuncionarioMain {

	public static void main(String[] args) {
		
		Funcionario funcionarioPerfil = new Funcionario();
		
		
		//4) Crie uma classe funcionário e apresente os atributos e métodos 
        //referentes esta classe, em seguida crie um objeto funcionário, defina 
       // as instancias deste objeto e apresente as informações deste objeto no console.
		
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
