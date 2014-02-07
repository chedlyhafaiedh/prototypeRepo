package tn.edu.esprit.gl8.nameOfTheProject.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Prototype
 *
 */
@Entity

public class Prototype implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;

	public Prototype() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
