package com.app.repository;

import java.util.ArrayList;

import com.app.models.BankAccount;
import com.app.models.Customer;
import com.app.models.Employee;

public interface CustomerDao {
	ArrayList<Customer> sellectAllCusstomers();
	public Customer sellectByUserName(String userName);
	boolean insertCustomer(Customer c);
}
