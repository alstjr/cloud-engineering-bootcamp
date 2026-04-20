package exam14_interface;

public class MyServiceImpl implements MyService, MyService2{

	@Override
	public void a() {
		System.out.println("a()");
		
	}

	@Override
	public void b() {
		System.out.println("b()");
		
	}

	@Override
	public void x() {
		System.out.println("x()");
	}
	
}
