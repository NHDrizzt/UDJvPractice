package ListReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int qt = sc.nextInt(), y = 0;
		List<Employee> list = new ArrayList<Employee>();
		for (int i = 1; i <= qt; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id:");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id taken. Try again.");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double sal = sc.nextDouble();
			list.add(new Employee(id, name, sal));
		}
		while (y != 1) {
			System.out.print("Enter the employee id that will have salary increase: ");
			int empId = sc.nextInt();
			Employee emp = list.stream().filter(x -> x.getId() == empId).findFirst().orElse(null);
			if (emp == null) {
				System.out.println("This id does not exist!");
			} else {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				emp.increasedSalary(percentage);
				y=1;
			}
		}

		for (Employee x : list) {
			System.out.println(x);
		}
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
