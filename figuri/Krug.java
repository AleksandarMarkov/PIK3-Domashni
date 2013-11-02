package figuri;

import java.util.Scanner;

public class Krug implements Figuri {
	
	double radius;
	
	public Krug (){
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete radius na okrujnostta:");
		this.radius=sc.nextDouble(); }
		
	public double perim() {
		return this.radius*2*Math.PI; }
	
	public double lice() {
		return Math.pow(radius, 2)*Math.PI; } }
