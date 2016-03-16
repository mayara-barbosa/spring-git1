package pucpr.bsi.prog4.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class NaMemoriaProdutoRepository implements ProdutoRepository {

	private static List<Produto> produtos = new ArrayList<>();
	
		static{
			produtos.add(new Produto());
			produtos.get(0).setId(1L);
			produtos.get(0).setNome("Tablet Samsung");
			produtos.get(0).setPreco(899.00);
			
			produtos.add(new Produto());
			produtos.get(1).setId(2L);
			produtos.get(1).setNome("Celular Iphone");
			produtos.get(1).setPreco(4_500.00);
			
			produtos.add(new Produto());
			produtos.get(2).setId(3L);
			produtos.get(2).setNome("Livro Java");
			produtos.get(2).setPreco(400.00);
		}
		
		@Override
		public List<Produto> obterTodos(){
			return produtos;
		}
}
