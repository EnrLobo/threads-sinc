import java.util.concurrent.Semaphore;

/*
  Classe com a estrutura compartilhada
  entre Produtor e Consumidor
*/
public class Cube {
	private int content = -1;
	public static final int LOOPS = 11;

	private final Semaphore semProdutor = new Semaphore(1);
	private final Semaphore semConsumidor = new Semaphore(0);

	public int get(String consumer) {
		try{
			semConsumidor.acquire();
			System.out.printf("\nConsumidor %s consumiu %d",consumer, content);

			semProdutor.release();
		}catch (InterruptedException e){
			Thread.currentThread().interrupt();
		}
		return content;
	}
	
	public void set(String producer, int value) {
		try{
			semProdutor.acquire();

			content = value;
			System.out.printf("\nProdutor %s produziu %d",producer, content);

			semConsumidor.release();
		}catch (InterruptedException e){
			Thread.currentThread().interrupt();
		}

	}
}
