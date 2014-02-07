package tn.edu.esprit.gl8.portfolioApp.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: User
 * 
 */
@Entity
@Table(name = "T_USER")
public class User implements Serializable {

	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	private List<CreditCard> creditCards;

	public User() {
		super();
	}

	public User(String name) {
		super();
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
	public List<CreditCard> getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(List<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}

	public void linkCreditsCardsWithThisUser(List<CreditCard> creditCards) {
		this.creditCards = creditCards;
		for (CreditCard c : creditCards) {
			c.setUser(this);

		}

	}
}
