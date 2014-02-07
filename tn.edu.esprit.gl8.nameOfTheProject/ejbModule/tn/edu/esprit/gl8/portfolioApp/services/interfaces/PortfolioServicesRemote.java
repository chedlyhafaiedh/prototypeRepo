package tn.edu.esprit.gl8.portfolioApp.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.gl8.portfolioApp.domain.CreditCard;
import tn.edu.esprit.gl8.portfolioApp.domain.User;

@Remote
public interface PortfolioServicesRemote {
	public void addCreditCard(CreditCard creditCard);

	public void addUser(User user);

}
