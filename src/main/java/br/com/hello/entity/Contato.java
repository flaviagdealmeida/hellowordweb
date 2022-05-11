package br.com.hello.entity;

import java.io.Serializable;
import java.util.Objects;

public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String email;
	
	public Contato() {

	}

	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "Nome: "+getNome()+" - email: "+getEmail();
	}
	

}
