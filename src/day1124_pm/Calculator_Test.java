package day1124_pm;

public class Calculator_Test {
	public static void main(String[] args) {
		Calculator num=new Calculator();
		num.getInput();
		//调用add()方法并打印
		System.out.println(num.add());
		//调用sub()方法并打印
		System.out.println(num.sub());
		//调用mult()方法并打印
		System.out.println(num.mult());
		//调用div()方法并打印
		System.out.println(num.div());
	}

}
