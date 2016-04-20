package pucpr.bsi.prog4.ModelsView;

import java.util.ArrayList;
import java.util.List;

import pucpr.bsi.prog4.models.Produto;

public class CarrinhoCompra {
	private List<CarrinhoCompraItem> itens;
	
	public List<CarrinhoCompraItem> getItens() {
		return itens;
	}

	public void setItens(List<CarrinhoCompraItem> itens) {
		this.itens = itens;
	}

	public CarrinhoCompra() {
		itens = new ArrayList<CarrinhoCompraItem>();
	}

	public void adicionar(Produto produto, int quantidade){
		CarrinhoCompraItem item;
		item= new CarrinhoCompraItem();
		item.setProduto(produto);
		item.setQuantidade(quantidade);
		
		itens.add(item);
				
	}

	
}
