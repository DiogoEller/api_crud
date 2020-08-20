package br.com.diogo.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.diogo.jpa.modelo.Pessoa;

public class CriaPessoa {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pessoas");
		EntityManager em = emf.createEntityManager();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("080.273.089.25");
		pessoa.setSexo(1);
		pessoa.setNome("Diogo Eller");
		
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
	}
}
