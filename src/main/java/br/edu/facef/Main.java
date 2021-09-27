package br.edu.facef;

import br.edu.facef.bussines.Calculos;
import br.edu.facef.bussines.ClienteBussines;
import br.edu.facef.dao.ClienteDAO;
import br.edu.facef.model.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Calculos calculo = new Calculos();
		
		System.out.println(calculo.somar(1,2));

		System.out.println("--------");
		
		Cliente novoCliente = new Cliente();
		novoCliente.setNome("Nome");
		novoCliente.setEstado("Estado");
		novoCliente.setCidade("Cidade");
		
		ClienteBussines clienteBussines = new ClienteBussines(new ClienteDAO());
		
		Cliente clienteSalvo = clienteBussines.salvarCliente(novoCliente);
		
		System.out.println("Cliente salvo: " + clienteSalvo);
	}

}
