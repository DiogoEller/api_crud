package br.com.diogo.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaTabelaPessoa {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pessoas");
		EntityManager createEntityManager = emf.createEntityManager();
		emf.close();
	}
}
