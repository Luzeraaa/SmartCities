package br.com.fiap.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Usuario;

public class Teste {
	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("projetox").createEntityManager();;		
		ClienteDAO dao = new ClienteDAO(em);
		
		
		Usuario usuario = new Usuario(0, "Carlos", "555");
		dao.cadastrar(usuario);
		
		try {
		dao.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		List<Usuario> lista = dao.listar(); 
		for (Usuario usuarios : lista) {
			System.out.println("Nome: " + usuarios.getNome() + " Senha " + usuarios.getSenha() );
		}
		
		
		
		
	}
}
