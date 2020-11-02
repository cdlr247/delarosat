package hilos;

public class TareaHilos {

	public static void main(String[] args) {
		Hilo unCorredor = new Hilo();
		Thread unHilo = new Thread(unCorredor);
		Thread otroHilo = new Thread(unCorredor);
		Thread otroHiloMas = new Thread(unCorredor);
		
		unHilo.setName("1");
		otroHilo.setName("2");
		otroHiloMas.setName("3");
		
		unHilo.start();
		otroHilo.start();
		otroHiloMas.start();
	}

}

class Hilo implements Runnable
{
	public void Correr()
	{
		System.out.println("El corredor " + Thread.currentThread().getName() + " está corriendo");
	}
	@Override
	public void run() {
		Correr();
	}
}
