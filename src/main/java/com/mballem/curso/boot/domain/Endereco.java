package com.mballem.curso.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {
	
	@NotBlank(message = "Logradouro é obrigatório.")
	@Size(min = 3, max = 255, message = "Campo logradouro deve ter entre {min} e {max} caracteres.")
	@Column(nullable = false)
	private String logradouro;
	
	@NotBlank(message = "Bairro é obrigatório.")
	@Size(min = 3, max = 255, message = "Campo bairro deve ter entre {min} e {max} caracteres.")	
	@Column(nullable = false)
	private String bairro;
	
	@NotBlank(message = "O campo cidade é obrigatório.")
	@Size(min = 3, max = 255, message = "Campo cidade deve ter entre {min} e {max} caracteres.")	
	@Column(nullable = false)
	private String cidade;
	
	@NotNull(message = "Selecione a UF.")
	@Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	@NotBlank(message = "Cep obrigatório.")
	@Size(min = 9, max = 9, message ="Cep deve ter {max} dígitos")
	@Column(nullable = false, length = 9)
	private String cep;
	
	@NotNull(message = "Digite o número residencial")
	@Digits(integer = 5,fraction = 0, message = "número deve ter no máximo {integer} digitos")
	@Column(nullable = false, length = 5)
	private Integer numero;
	
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
