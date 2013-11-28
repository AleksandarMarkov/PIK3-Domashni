package k_n_h;

import java.util.Random;

public class Igrach2 implements Runnable{
	public static int m;
	public void run() {
		Random rand = new Random();
		m=rand.nextInt(3)+1;
	}
}
