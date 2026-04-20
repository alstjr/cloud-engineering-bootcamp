package pack02_workshop06;

public class Ltab extends Mobile{
	
	public Ltab() {
		super();
	}

	public Ltab(String mobileName, int batterSize, String osType) {
		super(mobileName, batterSize, osType);
	}

	@Override
	public int operate(int time) {
	 
		setBatterySize(getBatterySize() - (time * 10));	
		return getBatterySize();
	}
		
		

	@Override
	public int charge(int time) {
		setBatterySize(getBatterySize() + (time * 10));
		return getBatterySize();
	}
	

}
