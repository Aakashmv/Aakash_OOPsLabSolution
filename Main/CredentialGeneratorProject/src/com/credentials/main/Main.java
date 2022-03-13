package com.credentials.main;

import java.util.Random;
import java.util.Scanner;

import com.credentials.model.Employee;
import com.credentials.service.CredentialService;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("\n first name :: ");
		String firstName = in.nextLine();
		System.out.print(" \n last name :: ");
		String lastName = in.nextLine();

		Employee e1 = new Employee(firstName, lastName);

		CredentialService cs = new CredentialService();

		System.out.println("\n Please select the department");
		System.out.println("\n1.Technical\n2.Admin\n3.Human Resource\n4.Legal");
		int option = in.nextInt();

		switch (option) {
		case 1:
			cs.showCredentials(e1, "tech");
			break;
		case 2:
			cs.showCredentials(e1, "admin");
			break;
		case 3:
			cs.showCredentials(e1, "hr");
			break;
		case 4:
			cs.showCredentials(e1, "legal");
			break;

		default:
			System.out.println("\n Invalid Department!");
			break;
		}

		in.close();

	}

}
