package k_n_h;

import java.util.Random;

public class Igrach1 implements Runnable {
	public static int l;
	public void run() {
		Random rand = new Random();
		l=rand.nextInt(3)+1;
	}
}
