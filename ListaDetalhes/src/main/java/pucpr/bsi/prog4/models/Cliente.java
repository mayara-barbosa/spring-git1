package pucpr.bsi.prog4.models;

import java.util.Date;

public class Cliente {
	private Long id;
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private String sexo;
	private String senha;
	private boolean receberOfertaPorEmail;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isReceberOfertaPorEmail() {
		return receberOfertaPorEmail;
	}
	public void setReceberOfertaPorEmail(boolean receberOfertaPorEmail) {
		this.receberOfertaPorEmail = receberOfertaPorEmail;
	}
	
	

}
