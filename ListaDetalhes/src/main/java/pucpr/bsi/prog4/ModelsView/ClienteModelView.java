package pucpr.bsi.prog4.ModelsView;

import pucpr.bsi.prog4.models.Cliente;

public class ClienteModelView {
	private Cliente cliente;
	private String confirmacaoSenha;
	
	public String getConfirmacaoSenha(){
		return confirmacaoSenha;
	}
	
	public void setConfirmacaoSenha(){
		this.confirmacaoSenha = confirmacaoSenha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}
	
	

}
