package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		System.out.println("================ \n"+ obj);
		
		Seller slr = new Seller(1, "Pedro", "pedro@gmail.com", new Date() , 1000.0 , obj);
		
		System.out.println("================ \n"+ slr);
	}

}
