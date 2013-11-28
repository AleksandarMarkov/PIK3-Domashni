package k_n_h;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int br;
		int ti1=0;
		int ti2=0;
		int ti3=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete broi igri: ");
		br=sc.nextInt();
		for (int i=1; i<=br; i++) {
		Thread I1 = new Thread (new Igrach1());
		Thread I2 = new Thread (new Igrach2());
		Thread I3 = new Thread (new Igrach3());
		I1.start();
		I2.start();
		I3.start();
		System.out.println("Press ENTER key to continue...");
		sc.nextLine();
		//Za igrata: 1 e kamuk, 2 e nojica i 3 e hartia
		System.out.println("Igrach 1 izbra "+Igrach1.l);
		System.out.println("Igrach 2 izbra "+Igrach2.m);
		System.out.println("Igrach 3 izbra "+Igrach3.n);
		if (Igrach1.l==1 && Igrach2.m==1 && Igrach3.n==1)
			System.out.println("Round Draw!");
		if (Igrach1.l==1 && Igrach2.m==1 && Igrach3.n==2) {
			ti1++;
			ti2++; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
			}
		if (Igrach1.l==1 && Igrach2.m==1 && Igrach3.n==3){
			ti3+=2; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==1 && Igrach2.m==2 && Igrach3.n==1){
			ti1++;
			ti3++; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==1 && Igrach2.m==2 && Igrach3.n==2){
			ti1+=2;
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==1 && Igrach2.m==2 && Igrach3.n==3)
			System.out.println("Round Draw!");
		
		if (Igrach1.l==1 && Igrach2.m==3 && Igrach3.n==1){
			ti2+=2;
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==1 && Igrach2.m==3 && Igrach3.n==2)
			System.out.println("Round Draw!");
		if (Igrach1.l==1 && Igrach2.m==3 && Igrach3.n==3){
			ti2++;
			ti3++; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==2 && Igrach2.m==1 && Igrach3.n==1){
			ti2++;
			ti3++; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==2 && Igrach2.m==1 && Igrach3.n==2){
			ti2+=2; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==2 && Igrach2.m==1 && Igrach3.n==3)
			System.out.println("Round Draw!");
		
		if (Igrach1.l==2 && Igrach2.m==2 && Igrach3.n==1){
			ti3+=2; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==2 && Igrach2.m==2 && Igrach3.n==2)
			System.out.println("Round Draw!");
		if (Igrach1.l==2 && Igrach2.m==1 && Igrach3.n==3){
			ti1++;
			ti2++; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==2 && Igrach2.m==3 && Igrach3.n==1)
			System.out.println("Round Draw!");
	
		if (Igrach1.l==2 && Igrach2.m==3 && Igrach3.n==2) {
			ti1++;
			ti3++; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==2 && Igrach2.m==3 && Igrach3.n==3) {
			ti1+=2; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==3 && Igrach2.m==1 && Igrach3.n==1) {
			ti1+=2;
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==3 && Igrach2.m==1 && Igrach3.n==2)
			System.out.println("Round Draw!");
		
		if (Igrach1.l==3 && Igrach2.m==1 && Igrach3.n==3){
			ti1++;
			ti3++; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==3 && Igrach2.m==2 && Igrach3.n==1)
			System.out.println("Round Draw!");
		
		if (Igrach1.l==3 && Igrach2.m==2 && Igrach3.n==2) {
			ti2++;
			ti3++; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==3 && Igrach2.m==2 && Igrach3.n==3) {
			ti2+=2; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==3 && Igrach2.m==3 && Igrach3.n==1) {
			ti1++;
			ti2++; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==3 && Igrach2.m==3 && Igrach3.n==2) {
			ti3+=2; 
			System.out.println("Tochkite na igrach 1 sa:"+ti1);
			System.out.println("Tochkite na igrach 2 sa:"+ti2);
			System.out.println("Tochkite na igrach 3 sa:"+ti3);
		}
		if (Igrach1.l==3 && Igrach2.m==3 && Igrach3.n==3)
			System.out.println("Round Draw!");
		}
		System.out.println("Krai na igrata! Rezultati:");
		System.out.println("Igrach 1: "+ ti1);
		System.out.println("Igrach 2: "+ ti2);
		System.out.println("Igrach 3: "+ ti3);
	}
}
