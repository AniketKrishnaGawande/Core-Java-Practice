package basicThread.numericThread;
import java.util.Scanner;

public class TesterThread {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("end start and end limit");
int start = sc.nextInt();
int begin = sc.nextInt();
			Thread t1 = new Thread(new EvenThread(start, begin));
			Thread t2 = new Thread(new PrimeThread(start, begin));
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
System.out.println("main ends");
	}

}
