package day1124_pm;
/*
 * ģ����������ܣ�ʵ�ּӼ��˳���
 */
import java.util.Scanner;

public class Calculator {
	int numA;
	int numB;
	public void getInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����:");
		numA=sc.nextInt();
		System.out.println("��������һ����:");
		numB=sc.nextInt();	
	}
	public int add(){
		return numA+numB;
	}
	public int sub(){
		return numA-numB;
	}
	public int mult(){
		return numA*numB;
	}
	public int div(){
		return numA/numB;
	}
	public int getAvg(){
		return add()/2;
	}
}
