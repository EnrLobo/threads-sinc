
public class Consumer extends Thread {
	private String name;
	private Cube cube;
	
	public Consumer(String name, Cube cube) {
		this.name = name;
		this.cube = cube;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < Cube.LOOPS; i++) {
			cube.get(name);
		}
	}
}
