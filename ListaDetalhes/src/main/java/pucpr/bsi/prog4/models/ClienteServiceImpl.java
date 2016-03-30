package pucpr.bsi.prog4.models;

public class ClienteServiceImpl implements ClienteService{
	
	private ClienteRepository clienteRepository;

	@Override
	public void cadastrar(Cliente c) {
		clienteRepository.inserir(c);
		
	}
	

}
