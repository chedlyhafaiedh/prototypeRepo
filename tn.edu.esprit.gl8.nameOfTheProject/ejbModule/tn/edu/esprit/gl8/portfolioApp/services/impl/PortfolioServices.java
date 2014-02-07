package tn.edu.esprit.gl8.portfolioApp.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.gl8.portfolioApp.domain.CreditCard;
import tn.edu.esprit.gl8.portfolioApp.domain.User;
import tn.edu.esprit.gl8.portfolioApp.services.interfaces.PortfolioServicesLocal;
import tn.edu.esprit.gl8.portfolioApp.services.interfaces.PortfolioServicesRemote;

/**
 * Session Bean implementation class PortfolioServices
 */
@Stateless
public class PortfolioServices implements PortfolioServicesRemote,
		PortfolioServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public PortfolioServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCreditCard(CreditCard creditCard) {
		entityManager.persist(creditCard);

	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);

	}

}
