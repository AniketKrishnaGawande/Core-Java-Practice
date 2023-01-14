package basicThread.numericThread;

public class PrimeThread implements Runnable{

		private int start;
		private int end;

		public PrimeThread(int start, int end) {
			this.start = start;
			this.end = end;
			System.out.println(Thread.currentThread().getName() + " created thread"); // main
		}

		@Override
		public void run() {

			System.out.println(Thread.currentThread().getName() + " thread started");

			for (int i = start; i <= end; i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i % 2 != 0) {
					System.out.println("odd no :: " + i);

				}
			}
			
			System.out.println("prime ends");

		}

	}
