package br.edu.facef.dao;

import br.edu.facef.model.Cliente;

public class ClienteDAO {
	
	public Cliente salvar(Cliente cliente) {
		cliente.setId(113L);
		
		// TODO: chamar fun��o de salvar no banco
		
		return cliente;
	}
	
}
