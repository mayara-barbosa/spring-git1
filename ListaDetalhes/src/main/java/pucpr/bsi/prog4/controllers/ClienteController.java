package pucpr.bsi.prog4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pucpr.bsi.prog4.ModelsView.ClienteModelView;
import pucpr.bsi.prog4.models.ClienteService;

	
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value="/clientes/novo",
					method = RequestMethod.GET)
	public String novo(Model model){
		model.addAttribute(" clientemv", new ClienteModelView());
		
		return "cliente-novo";
	}
	
	@RequestMapping(value="/clientes/novo",
			method = RequestMethod.POST)
	public String cadastrar(ClienteModelView clientemv, BindingResult bindingResult){
		clienteService.cadastrar(clientemv.getCliente());

		return "redirect:/clientes/novo-sucesso";
	}
	
	@RequestMapping("/clientes/novo-sucesso")
	public String novoSucesso(){
		return "cliente-novo-sucesso";
	}

}
