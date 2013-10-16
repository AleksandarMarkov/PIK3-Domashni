package polinom;

import java.util.Scanner;

public class Polinom {
public static double as[] = new double [100];

public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	int n=0;
	float x=0;
	double result=0;
	double par=0;
	System.out.print("Въведете степен на полинома:");
	n=scan.nextInt();
	System.out.println("Въведете коефицентите на полинома:");
	for(int i=0; i<=n; i++){
		as[i]=0;
		as[i]=scan.nextDouble();
	}
	System.out.println("Въведете параметъра Х за полинома:");
	x=scan.nextFloat();
	for(int i=n; i>=0; i--){
		par=as[i]*Math.pow(x, i);
		result+=par;
	}
	System.out.println("Стойността на полиномът е: ");
	System.out.println(result);
}
}
