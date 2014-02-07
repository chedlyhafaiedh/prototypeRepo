package tn.edu.esprit.gl8.portfolioApp.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: CreditCard
 * 
 */
@Entity
public class CreditCard implements Serializable {

	private int id;
	private int number;
	private static final long serialVersionUID = 1L;

	private User user;

	public CreditCard() {
		super();
	}

	public CreditCard(int number) {
		super();
		this.number = number;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@ManyToOne(cascade = CascadeType.PERSIST)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
