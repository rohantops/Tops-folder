package Assignment;
class multi extends Thread {
	public void run() {
		System.out.println("thread running");
	}
}
public class Q18_java {

	public static void main(String[] args) {
		multi m1 = new multi();
		m1.start();

	}

}
