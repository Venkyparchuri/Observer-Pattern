

import java.util.ArrayList;
import java.util.List;

public class RestaurantName implements Subject{


	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	private List<RestaurantTimingObserver> customers = new ArrayList<RestarentTimingObserver>();

	private boolean availble = true;

	@Override
	public void add(RestaurantTimingObserver observer) {
		customers.add(observer);

	}

	@Override
	public void remove(RestaurantTimingObserver observer) {
		customers.remove(observer);

	}

	@Override
	public void notifyAllObservers() {

		 for(RestaurantTimingObserver customer:customers){
			 customer.update(name);
		 }

	}

	public boolean isAvailble() {
		return availble;
	}

	public void setAvailble(boolean availble) {
		this.availble = availble;
	}

	public List<RestaurantTimingObserver> getCustomers() {
		return customers;
	}

	public void setCustomers(List<RestaurantTimingObserver> customers) {
		this.customers = customers;
	}



	public void updateRegisterdCustomers(boolean isAvailble) {

		if(isAvailble){

			notifyAllObservers();

		}else{
			System.out.println(this.name+" Restaurant closed ");
		}


	}



}
