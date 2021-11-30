package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ESTABELECIMENTOX")
public class Estabelecimento {

	
	@Id
	@Column(name = "ID_ESTABELECIMENTO")
	@SequenceGenerator(name = "estabelecimento", sequenceName = "SQ_TB_ESTABELECIMENTOX", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estabelecimento")
	private int id;
	
	@Column(name = "NM_ESTABELECIMENTO", nullable = false, length = 64)
	private String nome;

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
