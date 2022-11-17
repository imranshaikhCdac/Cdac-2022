package com.cdac.demo;



	import java.util.TreeSet;
	import com.cdac.bean.Employee;
	import com.cdac.bean.comparator.EmployeeNameComparator;
	import com.cdac.bean.comparator.EmployeeSalaryComparator;

	public class Demo {

		public static void main(String[] args) {

			TreeSet<Employee>ts = new TreeSet<Employee>();
			ts.add(new Employee(101, "Ramesh", 2500.0));
			ts.add(new Employee(103, "Mahesh", 5000.0));
			ts.add(new Employee(104, "Jayesh", 4500.0));
			ts.add(new Employee(102, "Sohan", 2100.0));
			System.out.println("Default sort");
			
			for(Employee e:ts){
	            System.out.println(e);
	        }
			
			TreeSet<Employee>ts1 = new TreeSet<Employee>(new EmployeeNameComparator());
			ts1.add(new Employee(101, "Ramesh", 2500.0));
			ts1.add(new Employee(103, "Mahesh", 5000.0));
			ts1.add(new Employee(104, "Jayesh", 4500.0));
			ts1.add(new Employee(102, "Sohan", 2100.0));
			System.out.println("Name wise sort");
			for(Employee e:ts1){
	            System.out.println(e);
	        }
			
			TreeSet<Employee>ts2 = new TreeSet<Employee>(new EmployeeSalaryComparator());
			ts2.add(new Employee(101, "Ramesh", 2500.0));
			ts2.add(new Employee(103, "Mahesh", 5000.0));
			ts2.add(new Employee(104, "Jayesh", 4500.0));
			ts2.add(new Employee(102, "Sohan", 2100.0));
			System.out.println("salaray sort");
			for(Employee e:ts2){
	            System.out.println(e);
	        }
			
		}
	}

