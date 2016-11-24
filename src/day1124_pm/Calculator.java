package day1124_pm;
/*
 * 模拟计算器功能，实现加减乘除；
 */
import java.util.Scanner;

public class Calculator {
	int numA;
	int numB;
	public void getInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数:");
		numA=sc.nextInt();
		System.out.println("请再输入一个数:");
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
