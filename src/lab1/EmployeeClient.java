package lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		
		System.out.println("Employee Details");
		System.out.println("----------------------");
		System.out.println("Employee name="+employee.getName());
		System.out.println("Employee ID="+employee.getId());
		System.out.println("Employee age="+employee.getAge());
		System.out.println("Employee BU="+employee.getBU());
		System.out.println("Employee Salary="+employee.getSalary());

	}

}
