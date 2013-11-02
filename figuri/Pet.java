package figuri;

import java.util.Scanner;

public class Pet implements Figuri{
	
	double a;
	
	public Pet (){
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete stranata na pravilniq petougulnik:");
		this.a=sc.nextDouble(); }
	
	public double perim() {
		return this.a*5; }
	
	public double lice() {
		double apotema=0;
		apotema=this.a/(2*Math.tan(Math.PI/5));
		return (this.a*5)*apotema/2; } }
