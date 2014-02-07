package tn.edu.esprit.gl8.nameOfTheProjectClient;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.gl8.portfolioApp.domain.CreditCard;
import tn.edu.esprit.gl8.portfolioApp.domain.User;
import tn.edu.esprit.gl8.portfolioApp.services.interfaces.PortfolioServicesRemote;

public class TestAddUserWithManyCreditCards {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			PortfolioServicesRemote portfolioServicesRemote = (PortfolioServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.gl8.portfolioApp/PortfolioServices!"
							+ PortfolioServicesRemote.class.getCanonicalName());

			User user = new User("Ramzi");

			List<CreditCard> creditCards = new ArrayList<>();

			CreditCard creditCard = new CreditCard(5541);
			CreditCard creditCard2 = new CreditCard(6642);

			creditCards.add(creditCard);
			creditCards.add(creditCard2);

			user.linkCreditsCardsWithThisUser(creditCards);

			portfolioServicesRemote.addUser(user);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
