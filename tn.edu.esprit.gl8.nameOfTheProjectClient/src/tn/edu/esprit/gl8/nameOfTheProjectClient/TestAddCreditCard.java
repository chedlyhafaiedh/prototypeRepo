package tn.edu.esprit.gl8.nameOfTheProjectClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.gl8.portfolioApp.domain.CreditCard;
import tn.edu.esprit.gl8.portfolioApp.services.interfaces.PortfolioServicesRemote;

public class TestAddCreditCard {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			PortfolioServicesRemote portfolioServicesRemote = (PortfolioServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.gl8.portfolioApp/PortfolioServices!"
							+ PortfolioServicesRemote.class.getCanonicalName());

			CreditCard creditCard = new CreditCard(5541);

			portfolioServicesRemote.addCreditCard(creditCard);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
