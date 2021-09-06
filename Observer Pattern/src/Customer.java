

public class Customer implements RestaurantTimingObserver{

	private String custName;

	private Subject subject ;


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void update(String  itemName) {

		 System.out.println("Sub:Restaurant closing alert notification \n");
		System.out.println("Hello "+custName+ ": "+itemName+" Restaurant will close in next 10 mints,order your favourate food\n"); 
		System.out.println("--------------------------------------------- \n");
	}



}
