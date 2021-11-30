package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USUARIOX")
public class Usuario {

	@Id
	@Column(name = "ID_USUARIO")
	@SequenceGenerator(name = "usuario", sequenceName = "SQ_TB_USUARIOX", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
	private int id;

	@Column(name = "NM_USUARIO", nullable = false, length = 64)
	private String nome;

	@Column(name = "NM_SENHA", nullable = false, length = 16)
	private String senha;

	public Usuario() {
		super();
	}

	public Usuario(int id, String nome, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
