package workshop03;

public class Test06 {
	public static void main(String[] args) {
		for(int x=1; x<=6; x++) {
			for(int y=1; y<=6; y++) {
				for(int z=1; z<=6; z++) {
					if((x*y*z)%3==0) {
						System.out.println(x+" * "+y+" * "+z+" = "+(x*y*z) );
					}
				}
			}
		}
	}
}
