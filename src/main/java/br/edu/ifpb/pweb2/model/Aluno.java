package br.edu.ifpb.pweb2.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "tb_alunos")
public class Aluno {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	private String nome;
	private Long  matricula;
	private String curso;

	
	
	
	public Aluno() {
	}

	
	
	public Aluno(String nome) {
		super();
		this.nome = nome;
	}



	public Integer getId() {
		return Id;
	}



	public void setId(Integer id) {
		Id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Long getMatricula() {
		return matricula;
	}



	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}

	


	
}
