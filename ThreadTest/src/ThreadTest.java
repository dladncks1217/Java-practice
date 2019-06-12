

public class ThreadTest {
	public static void main(String[] args) {
		CounterThread counterTH = new CounterThread();
		counterTH.start();
		
		for(int i = 0;i<10;i++) {
			System.out.println("["+Thread.currentThread().getName()+"] Count: "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	private static class CounterThread extends Thread{
		@Override
		public void run() {
			super.run();
			for(int i = 0;i<10;i++) {
				System.out.println("["+getName()+"[ Count:"+i);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
