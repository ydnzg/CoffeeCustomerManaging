import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager2= new NeroCustomerManager();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("ONUR");
		customer.setLastName("CORA");
		customer.setDateOfBirth(new Date(1993,4,10));
		customer.setNationalityId("63836179548");
			
		customerManager1.save(customer);
		customerManager2.save(customer);
	

	}

}
