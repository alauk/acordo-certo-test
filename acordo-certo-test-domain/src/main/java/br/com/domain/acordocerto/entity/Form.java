package br.com.domain.acordocerto.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Form {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String nome;
	private char sexo;
	private String estado;
	
	public Form() {
		setNome("");
		setSexo('M');
		setEstado("");
	}
	public Form(String nome, char sexo, String estado) {
		setNome(nome);
		setSexo(sexo);
		setEstado(estado);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
