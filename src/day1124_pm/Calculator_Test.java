package day1124_pm;

public class Calculator_Test {
	public static void main(String[] args) {
		Calculator num=new Calculator();
		num.getInput();
		//����add()��������ӡ
		System.out.println(num.add());
		//����sub()��������ӡ
		System.out.println(num.sub());
		//����mult()��������ӡ
		System.out.println(num.mult());
		//����div()��������ӡ
		System.out.println(num.div());
	}

}
