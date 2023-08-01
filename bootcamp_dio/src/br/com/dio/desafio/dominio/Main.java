package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Descricao Java");
		curso1.setCargaHoraria(3);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Descricao JavaScript");
		curso2.setCargaHoraria(89);
		
		Conteudo conteudo = new Curso();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		System.out.println(conteudo);
	}
}
