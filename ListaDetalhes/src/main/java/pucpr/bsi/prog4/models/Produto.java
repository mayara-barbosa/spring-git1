package pucpr.bsi.prog4.models;

public class Produto {
	private long id;
	private Categoria categoria;
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Number getPreco() {
		return preco;
	}
	public void setPreco(Number preco) {
		this.preco = preco;
	}
	private String nome;
	private Number preco;

}
