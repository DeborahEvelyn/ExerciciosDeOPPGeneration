package ClienteExemplo;

import java.util.Scanner;

import Cliente.NovoCliente;

public class ClienteMain {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		NovoCliente clientePerfil = new NovoCliente();
		
		//Crie uma classe cliente e apresente os atributos e métodos 
		//referentes esta classe, em seguida crie um objeto cliente, 
		//defina as instancias deste objeto e apresente as informações deste objeto no console.
		
		
		clientePerfil.nome = "Carlos";
		clientePerfil.endereco = "Rua XX";
		clientePerfil.email = "carlos@gmail.com";
		clientePerfil.matricula = 34324;
		clientePerfil.telefone = 981710081;
		
		System.out.println(clientePerfil.nome);		

		System.out.println(clientePerfil.endereco);		

		System.out.println(clientePerfil.email);		

		System.out.println(clientePerfil.matricula);
		
		System.out.println(clientePerfil.telefone);
		

		
		NovoCliente clientePerfil2 = new NovoCliente();
		
		System.out.println("");
		
		clientePerfil2.nome = "Maria";
		clientePerfil2.endereco = "Rua XV";
		clientePerfil2.email = "maria@gmail.com";
		clientePerfil2.matricula =30545;
		clientePerfil2.telefone = 981710099;
		
		System.out.println(clientePerfil2.nome);
				
		System.out.println(clientePerfil2.endereco);		
		
		System.out.println(clientePerfil2.email);	
		
		System.out.println(clientePerfil2.matricula);		
		
		System.out.println(clientePerfil2.telefone);
		

		
		
		
		
	}

	
}
