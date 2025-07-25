package application;

import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {

	public static void main(String[] args) {

		Department dp = new Department(1, "Books");
		System.out.println(dp);

		Seller seller = new Seller(21, "Leonardo", "leonardo@hotmail.com", new Date(), 1000.0, dp);
		System.out.println(seller);
	}
}
