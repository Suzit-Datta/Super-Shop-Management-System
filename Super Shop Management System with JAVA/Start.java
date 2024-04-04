import java.lang.*;

import Entity.Employee;
import Entity.Customer;
import Entity.Product;
import Entity.VegetableAndFruit;
import Entity.Drinks;
import Entity.MeatAndFish;

import EntityList.ProductList;
import EntityList.CustomerList;
import EntityList.EmployeeList;

import Interface.IEmployee;
import Interface.ICustomer;

import GUI.Login;
import GUI.Register;
import GUI.Dashboard;

public class Start{
	public static void main(String[] args){
		
		//Employee employee = new Employee(001,"Suzit", "male", 2000);
		//Customer customer = new Customer("Arnob", 1001, "01712383247");
		//VegetableAndFruit vegi = new VegetableAndFruit(101, "Mango", 150.5, "Summer", 20);
		//Drinks drinks = new Drinks(501, "Coka Cola", 30, "Bevarage", 30);
		//MeatAndFish meatFish = new MeatAndFish(701, "Chicken Leg Piece", 45, "Meat", 10);
		
		//ProductList products = new ProductList();
		//products.insert(new Product(101, "Mango", 150.5));
		//products.insert(new Product(102, "Apple", 250.7));
		
		//CustomerList customers = new CustomerList();
		//customers.insert(new Customer("Suzit datta", 101, "01723498234"));
		//customers.insert(new Customer("Shudipto", 102, "01623498234"));
		//customers.insert(new Customer("Shantonu", 103, "01823435533"));	
		
		//EmployeeList employees = new EmployeeList();
		//employees.insert(new Employee(1001, "Suzit datta", "male", 20000.0));
		//employees.insert(new Employee(1002, "Antu datta", "male", 30000.0));
		//employees.insert(new Employee(1003, "Dipto datta", "female", 24000.0));

		//CustomerList customers = new CustomerList();

		//Customer c1 = new Customer("Suzit datta", 101, "01723498234");
		//c1.getProductList().insert(new Product(1001, "Mango", 150.5));
		//c1.getProductList().insert(new VegetableAndFruit(1002, "Apple", 250.7, "Summer", 5));
		//c1.getProductList().insert(new VegetableAndFruit(1002, "Apple", 250.7, "Summer", 5));

		//customers.insert(c1);
		
		//employee.show();
		//customer.show();
		//vegi.show();
		//drinks.show();
		//meatFish.show();
		
		//products.showAll();
		//customers.showAll();
		//employees.showAll();
		
		//customers.getByID(101).show();
		
		Login login = new Login(); //del /s *.class && javac Start.java && java Start
	}
}