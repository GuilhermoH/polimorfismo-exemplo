package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.entities.Employee;
import src.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.println("How many employee's?");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Employee N-" + i);
			System.out.println("This employee is outsourced?(y/n)?");
			char c = sc.next().charAt(0);
			System.out.println("Employee Name-");
			String name = sc.next();
			System.out.println("How many hours?");
			int hours = sc.nextInt();
			System.out.println("Value per Hour?");
			double valuePerHour = sc.nextDouble();
			if (c == 'y') {
				System.out.println("Additional Charge-");
				double additionalCharge = sc.nextDouble();
				Employee outsourced = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(outsourced);
			}
			else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);

			}

		}
		for(Employee emp1:list) {
			System.out.println("NAME: "+emp1.getName()+" PAYMENT: "+ emp1.payment());
		} 
	}

}
