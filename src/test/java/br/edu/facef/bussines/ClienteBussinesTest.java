package br.edu.facef.bussines;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.facef.dao.ClienteDAO;
import br.edu.facef.model.Cliente;

@RunWith(MockitoJUnitRunner.class)
public class ClienteBussinesTest {

	@Mock
	private ClienteDAO clienteDAO;
	
	@Test
	public void deveSalvarClienteSucesso() {
		Cliente clienteMock = new Cliente();
		clienteMock.setId(11L);
		clienteMock.setNome("NomeMock");
		clienteMock.setEstado("EstadoMock");
		clienteMock.setCidade("CidadeMock");
		
		Cliente novoCliente = new Cliente();
		novoCliente.setNome("Nome");
		novoCliente.setEstado("Estado");
		novoCliente.setCidade("Cidade");
		
		Mockito.when(clienteDAO.salvar(novoCliente)).thenReturn(clienteMock);
		
		ClienteBussines clienteBussines = new ClienteBussines(clienteDAO);
		
		Cliente clienteSalvo = clienteBussines.salvarCliente(novoCliente);
		
		assertEquals(new Long(11), clienteSalvo.getId());
	}

}
