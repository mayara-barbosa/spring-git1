package pucpr.bsi.prog4.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProdutoServicelmpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public List<Produto> obterTodos() {
		// TODO Auto-generated method stub
		return produtoRepository.obterTodos();
	}
	@Override
	public Produto obterPorId(long id){
		return produtoRepository.obterPorId(id);
	}
	
	@Override
	public List<Produto> obterPorCategoria(long id){
		return produtoRepository.obterPorCategoria(id);
	}
}
