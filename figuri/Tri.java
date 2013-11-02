package figuri;

import java.util.Scanner;

public class Tri implements Figuri {
	
	double a, b, c, h;
	String str;
	
	public Tri() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete stranite A, B i C na triugulnika:");
		this.a=sc.nextDouble();
		this.b=sc.nextDouble();
		this.c=sc.nextDouble();
		System.out.println("Vuvedete visochinata na triugulnika:");
		this.h=sc.nextDouble();
		System.out.println("Kum koq strana e vuvedenata visochina (a, b ili c)?");
		this.str=sc.next(); }
	
	public double perim() {
		return this.a + this.b + this.c; }
	
	public double lice() {
		double rez=0;
		switch (this.str){
		case "a":
			rez = (this.a*this.h)/2;
			break;
		case "b":
			rez = (this.b*this.h)/2;
			break;
		case "c":
			rez = (this.c*this.h)/2;
			break; }
		return rez;	} }
