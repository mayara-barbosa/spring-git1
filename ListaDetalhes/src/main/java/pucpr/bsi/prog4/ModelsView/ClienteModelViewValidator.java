package pucpr.bsi.prog4.ModelsView;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pucpr.bsi.prog4.models.Cliente;

public class ClienteModelViewValidator implements Validator {

	@Override
	public boolean supports(Class<?> clzz) {
		
		return ClienteModelView.class.isAssignableFrom(clzz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ClienteModelView clienteModelView;
		clienteModelView = (ClienteModelView) target;
		
		Cliente cliente;
		cliente= clienteModelView.getCliente();
		
		if(! clienteModelView.getConfirmacaoSenha().equals(cliente.getSenha())){
			errors.rejectValue( "confirmacaoSenha", "","A senha e a confirmação nao conferem");
		}
		
		
		
	}

}
