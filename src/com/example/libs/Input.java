package com.example.libs;
import java.util.Scanner;

public class Input {
	private Employee[] array;
	private Scanner sc;
	private int count;

	public Input(Employee[] array) { // 생성자만들기.(scanner, count는 main에서 받아오지 않아서 제거)
		this.array = array;
		this.sc = new Scanner(System.in);
		this.count = 0;
	}

	public int input() {
		String y_n = null;
		do {
			System.out.print("사원번호 : "); String empno = this.sc.nextLine();
			System.out.print("사원이름 : "); String name = this.sc.nextLine();
			System.out.print("기본급 : "); int base = this.sc.nextInt();
			System.out.print("야근시간 : "); int night =  this.sc.nextInt();
			System.out.print("가족수 : "); int family = this.sc.nextInt();
			this.sc.nextLine(); //buffer 날리자
			this.array[count] = new Employee(empno, name, base, night, family);
			count++;
			System.out.println("Again(y/n)? : ");
			y_n = this.sc.next();
		}while(y_n.equals("Y") || y_n.equals("y"));
		return count;
	}

}