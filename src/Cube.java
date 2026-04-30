/* 
  Classe com a estrutura compartilhada
  entre Produtor e Consumidor
*/
public class Cube {
	private int content = -1;
	public static final int LOOPS = 10;
	
	public int get(String consumer) {
		System.out.printf("\nConsumidor %s consumiu %d", 
				consumer, content);
		return content;
	}
	
	public void set(String producer, int value) {
		content = value;
		System.err.printf("\nProdutor %s produziu %d",
				producer, content);
	}
}
