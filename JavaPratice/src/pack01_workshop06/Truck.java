package pack01_workshop06;

public class Truck extends Car {

	public Truck() {
		super();
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public double getEfficiency() {

		return super.getEfficiency() - ((getCurWeight() / 5) * 0.2);
	}
	
	public void moving(int distance) {
		double oil = calcOil(distance);
		 setRestOil(getRestOil() - oil);
	}
	
	private double calcOil(int distance) {
		return distance/getEfficiency();
	}
	
	public int getCost(int distance) {
		double oil = calcOil(distance);
		return (int)(oil * 3000);
	}
	
	 public String toString() {
	        return super.toString() + "\t\t" + getEfficiency();
	    }
}
