
public class Main {
	
	public static void main(String[] args) {
		Cube sharedCube = new Cube();
		
		Producer p = new Producer("P1", sharedCube);
		Consumer c = new Consumer("C1", sharedCube);
		
		p.start();
		c.start();
	}
}
