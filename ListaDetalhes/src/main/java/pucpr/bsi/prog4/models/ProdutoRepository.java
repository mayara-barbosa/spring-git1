package pucpr.bsi.prog4.models;

import java.util.List;

public interface ProdutoRepository {
	List<Produto> obterTodos();
	Produto obterPorId(long id);
	List<Produto> obterPorCategoria(long id);
}
