package br.edu.facef.bussines;

import br.edu.facef.dao.ClienteDAO;
import br.edu.facef.model.Cliente;

public class ClienteBussines {

	private ClienteDAO clienteDAO;
	
	public ClienteBussines(ClienteDAO dao) {
		this.clienteDAO = dao;
	}
	
	public Cliente salvarCliente(Cliente cliente) {
		if ( cliente == null || cliente.getNome().isEmpty()) {
			throw new RuntimeException("Nome requerido");
		}
		
		return this.clienteDAO.salvar(cliente);
	}
}
