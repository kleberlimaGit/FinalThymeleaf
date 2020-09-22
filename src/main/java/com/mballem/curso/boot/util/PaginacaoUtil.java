package com.mballem.curso.boot.util;

import java.util.List;

public class PaginacaoUtil<T> {
	private int tamanho;// numero de linhas
	private int pagina;// numero da pagina atual
	private long totalDePaginas;// armazenar o total de paginas.
	private List<T> registros;
	private String direcao;
	
	public PaginacaoUtil(int tamanho, int pagina, long totalDePaginas, List<T> registros, String direcao) {
		super();
		this.tamanho = tamanho;
		this.pagina = pagina;
		this.totalDePaginas = totalDePaginas;
		this.registros = registros;
		this.direcao = direcao;
	}
	public int getTamanho() {
		return tamanho;
	}

	public int getPagina() {
		return pagina;
	}

	public long getTotalDePaginas() {
		return totalDePaginas;
	}

	public List<T> getRegistros() {
		return registros;
	}

	public String getDirecao() {
		return direcao;
	}
	
}
