

public class TestObserver {

	public static void main(String[] args) throws InterruptedException {


		Customer c1 = new Customer();
		c1.setCustName("Venkateshwar Parchuri");
		Customer c2 = new Customer();
		c2.setCustName("Seshi");

		System.out.println("Uber Eats customers  " + c1.getCustName() + " and " + c2.getCustName()+"\n");
		 System.out.println("Sending notifictation In app........\n");
		RestarantName phone = new RestaurantName();
		phone.setAvailble(false);
		phone.add(c1);
		phone.add(c2);

		phone.setName("Hilltop");
		phone.setAvailble(true);
		phone.updateRegisterdCustomers(phone.isAvailble());

		Thread.sleep(6000);
		System.out.println("After 10 mints..\n");
		phone.setAvailble(false);

		phone.updateRegisterdCustomers(phone.isAvailble());

	}

}
