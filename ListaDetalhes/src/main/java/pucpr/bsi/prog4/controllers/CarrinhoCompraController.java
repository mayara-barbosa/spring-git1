package pucpr.bsi.prog4.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pucpr.bsi.prog4.ModelsView.CarrinhoCompra;
import pucpr.bsi.prog4.ModelsView.CarrinhoCompraItem;
import pucpr.bsi.prog4.models.Produto;
import pucpr.bsi.prog4.models.ProdutoService;

@Controller
public class CarrinhoCompraController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(method=RequestMethod.POST, 
					value="/carrinho-compra")
	public String adicionar(@RequestParam("produtoId")
							long produtoId,
							HttpServletRequest request)
	{
		CarrinhoCompra carrinho;
	
		carrinho = (CarrinhoCompra) request.getSession()
							.getAttribute("CarrinhoCompras");
		
		if(carrinho == null){
			carrinho = new CarrinhoCompra();
			request.getSession().setAttribute("CarrinhoCompra",carrinho);
		}
		
		CarrinhoCompraItem item;
		item = carrinho.getItens()
					   .stream()
					   .filter(i-> i.getProduto().getId() == produtoId)
					   .findFirst()
					   .orElse(null);
		if(item!= null){
			item.setQuantidade(item.getQuantidade()+ 1);
		}
		else{
			Produto produto;
			produto = produtoService.obterPorId(produtoId);
			if(produto == null)
				throw new IllegalArgumentException("Codigo invalido");
			carrinho.adicionar(produto, 1);
		}
		
			return "redirect:/carrinho-compra";
		
	
	}
	
	@RequestMapping(value="/carrinho-compra",
					method=RequestMethod.GET)
	public String listar(){
		return "carrinho-compra";
	}
	
}
	
	

