package pucpr.bsi.prog4.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class NaMemoriaProdutoRepository implements ProdutoRepository {

	private static List<Produto> produtos = new ArrayList<>();
	
		static{
			produtos.add(new Produto());
			produtos.get(0).setId(1L);
			produtos.get(0).setNome("Tablet Samsung");
			produtos.get(0).setPreco(899.00);
			produtos.get(0).setCategoria(new Categoria());
			produtos.get(0).getCategoria().setId(1);
			produtos.get(0).getCategoria().setNome("Eletronicos");
			
			
			produtos.add(new Produto());
			produtos.get(1).setId(2L);
			produtos.get(1).setNome("Celular Iphone");
			produtos.get(1).setPreco(4_500.00);
			produtos.get(1).setCategoria(produtos.get(0).getCategoria());
			
			produtos.add(new Produto());
			produtos.get(2).setId(3L);
			produtos.get(2).setNome("Livro Java");
			produtos.get(2).setPreco(400.00);
			produtos.get(2).setCategoria(new Categoria());
			produtos.get(2).getCategoria().setId(2);
			produtos.get(2).getCategoria().setNome("Livros");
		}
		
		@Override
		public List<Produto> obterTodos(){
			return produtos;
		}
		
		@Override
		public Produto obterPorId(long id){
			return produtos.stream()
							.filter(p -> p.getId()== id)
							.findFirst()
		
							.get();
//			for(Produto p: produtos){
//				if(p.getId()==id){
//					return p;
//				}
//			}
			
			
		}
		
		@Override
		public List<Produto> obterPorCategoria(long id){
			
			return produtos.stream()
							.filter(p -> p.getCategoria().getId() == id)
							.collect(Collectors.toList());
//			for(Produto p: produtos){
//				if(p.getCategoria().getId() == id){
//					return ;
//				}
//			}
//			return null;
			
		}
}
