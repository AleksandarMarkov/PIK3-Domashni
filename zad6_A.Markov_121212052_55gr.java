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
	System.out.print("�������� ������ �� ��������:");
	n=scan.nextInt();
	System.out.println("�������� ������������ �� ��������:");
	for(int i=0; i<=n; i++){
		as[i]=0;
		as[i]=scan.nextDouble();
	}
	System.out.println("�������� ���������� � �� ��������:");
	x=scan.nextFloat();
	for(int i=n; i>=0; i--){
		par=as[i]*Math.pow(x, i);
		result+=par;
	}
	System.out.println("���������� �� ��������� �: ");
	System.out.println(result);
}
}
