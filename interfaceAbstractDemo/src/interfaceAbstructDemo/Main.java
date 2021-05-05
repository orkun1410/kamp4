package interfaceAbstructDemo;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Concrete.NeroCustomerManager;
import Concrete.SturbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "orkun", "tiryaki", 2001 , "123456789");
		BaseCustomerManager customerManager = new SturbucksCustomerManager(new CustomerCheckService() {
		
			
		
			@Override
			public boolean CheckIfRealPerson(Customer Customer) {
				return false;
			}
			
			Customer customer2 = new Customer(1, "orkun" , "tiryaki", 2001 , "11675246754");
			BaseCustomerManager customerManager = new NeroCustomerManager();
		});
		customerManager.save(customer1);
	}

}