package pucpr.bsi.prog4.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pucpr.bsi.prog4.ModelsView.ClienteModelView;
import pucpr.bsi.prog4.ModelsView.ClienteModelViewValidator;
import pucpr.bsi.prog4.models.ClienteService;

@Controller	
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder){
		
		binder.addValidators(new ClienteModelViewValidator());
	}
	
	@RequestMapping(value="/clientes/novo",
					method = RequestMethod.GET)
	public String novo(Model model){
		model.addAttribute("clientemv", new ClienteModelView());
		
		return "cliente-novo";
	}
	
	@RequestMapping(value="/clientes/novo",
			method = RequestMethod.POST)
	public String cadastrar(@Valid
							@ModelAttribute("clientemv")
							ClienteModelView clientemv, 
							BindingResult bindingResult){
			
		if( bindingResult.hasErrors()){
				return "cliente-novo";
			}
			else{
				clienteService.cadastrar(clientemv.getCliente());

				return "redirect:/clientes/novo-sucesso";
			}
		
	}
	
	@RequestMapping("/clientes/novo-sucesso")
	public String novoSucesso(){
		return "novo-sucesso";
	}

	
}
