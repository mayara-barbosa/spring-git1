package pucpr.bsi.prog4.models;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;



public class Cliente {
	private Long id;
	
	@Size(min=5, message="Nome deve conter no minimo 5 caracteres")
	private String nome;
	
	@NotNull(message="CPF nao pode estar em branco")
	@Digits(integer=11, fraction=0, message="O CPF deve conter apenas numeros")
	private Long cpf;
	
	@NotNull(message="Data de nascimento deve ser preenchida")
	@DateTimeFormat(iso=ISO.DATE)
	private Date dataNascimento;
	
	@Pattern(regexp="(M|F)", message="Sexo invalido")
	private String sexo;
	
	@Size(min=6, max=15)
	private String senha;
	
	@NotNull
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
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
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
	public boolean getReceberOfertaPorEmail() {
		return receberOfertaPorEmail;
	}
	public void setReceberOfertaPorEmail(boolean receberOfertaPorEmail) {
		this.receberOfertaPorEmail = receberOfertaPorEmail;
	}
	
	

}
