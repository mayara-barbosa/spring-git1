package pucpr.bsi.prog4.models;

import java.util.List;

public interface ProdutoService {
	List<Produto> obterTodos();
	Produto obterPorId(long id);
}
