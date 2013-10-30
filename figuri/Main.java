package figuri;

import java.util.Scanner;

public class Main {
	
public static void main (String[]args){
	
	double per=0;
	double lice=0;
	String izbor;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Vuvedete k za krug, t za triugulnik ili p za petougulnik:");
	izbor=sc.next();
	
	switch (izbor) {
	
	case "k": {
		Krug Okrujnost=new Krug(0);
		per=Okrujnost.perim(); 
		lice=Okrujnost.lice();
		System.out.println("Perimetura na kruga e:");
		System.out.println(per);
		System.out.println("Liceto na kruga e:");
		System.out.println(lice); 
		break; } 
	
	case "t": {
		Tri Triugulnik = new Tri(0,0,0,0,"");
		per=Triugulnik.perim();
		lice=Triugulnik.lice();
		System.out.println("Perimetura na triugulnika e:");
		System.out.println(per);
		System.out.println("Liceto na triugulnika e:");
		System.out.println(lice); 	
		break; }
	
	case "p": {
		Pet Petougulnik = new Pet(0);
		per=Petougulnik.perim();
		lice=Petougulnik.lice();
		System.out.println("Perimetura na petougulnika e:");
		System.out.println(per);
		System.out.println("Liceto na petougulnika e:");
		System.out.println(lice);	
		break; } } } }
