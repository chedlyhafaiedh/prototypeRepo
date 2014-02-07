package tn.edu.esprit.gl8.nameOfTheProjectClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestPrototype {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
