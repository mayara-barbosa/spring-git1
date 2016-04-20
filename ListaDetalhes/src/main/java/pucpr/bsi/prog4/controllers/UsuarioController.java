package pucpr.bsi.prog4.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {

	@RequestMapping("/usuario")
	public String formulario(){
		return "usuario-formulario";
	}
	
	@RequestMapping(value="/usuario",
					method=RequestMethod.POST)
	public String tratarFormulario(@RequestParam String nome,
									HttpServletResponse response){
		response.addCookie(new Cookie("nome", nome));
		return "usuario-formulario-sucesso";
	}
}
