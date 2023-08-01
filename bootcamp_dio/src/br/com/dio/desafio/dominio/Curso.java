package br.com.dio.desafio.dominio;

public class Curso {
	private String titulo;
	private String descricao;
	private Integer cargaHoraria;
	
	public Curso() {
		
	}
	
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		
		return "Curso{" +
				"titulo='" + titulo + '\'' +
				", descricao='"+ descricao + '\'' +
				", cargaHoraria="+ cargaHoraria +
				'}';
	}
	
}
