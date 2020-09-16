package pacienteExemplo;

import paciente.Paciente;

public class PacienteMain {

	public static void main(String[] args) {
		
		Paciente listaPaciente = Paciente();
		
		/*7) Crie uma classe paciente e apresente os atributos 
		 * e métodos referentes esta classe, em seguida crie um 
		 * objeto paciente, defina as instancias deste objeto e apresente 
		 * as informações deste objeto no console.
		 */
		
		listaPaciente.nome = "Deborah";
		listaPaciente.email = "deborah@gmail.com";
		listaPaciente.telefone = 99887766;
		listaPaciente.endereco = "Rua V";
		
		System.out.println(listaPaciente.nome);
		
		System.out.println(listaPaciente.email);

		System.out.println(listaPaciente.telefone);
		
		System.out.println(listaPaciente.endereco);
		

	}

	
	}
	

