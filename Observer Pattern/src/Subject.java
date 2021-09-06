

public interface Subject {

	public void add(RestaurantTimingObserver observer);

	public void remove(RestaurantTimingObserver observer);

	public void notifyAllObservers();

}
