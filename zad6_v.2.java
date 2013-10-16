package polinom;

import java.util.Scanner;

public class Polinom {
public static double as[];

public static double izch(int n, float x) {
	double result=0;
	double par=0;
	for(int i=n; i>=0; i--){
		par=as[i]*Math.pow(x, i);
		result+=par; }
	return result; }

public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=0;
	float x=0;
	System.out.print("Vuvedete stepen na polinoma:");
	n=scan.nextInt();
	as=new double [n+1];
	System.out.println("Vuvedete koeficientite na polinoma:");
	for(int i=0; i<=n; i++){
		as[i]=0;
		as[i]=scan.nextDouble(); }
	System.out.println("Vuvedete parametura X na polinoma:");
	x=scan.nextFloat();
	double result=izch(n,x);
	System.out.println("Stoinostta na polinoma e: ");
	System.out.println(result); } }
