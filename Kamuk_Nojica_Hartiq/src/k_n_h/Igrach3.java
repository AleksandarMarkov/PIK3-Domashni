package k_n_h;

import java.util.Random;

public class Igrach3 implements Runnable{
	public static int n;
	public void run(){
		Random rand = new Random();
		n=rand.nextInt(3)+1;
	}
}
