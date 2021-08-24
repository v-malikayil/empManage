package com.jenkinstuff.empmanage;

import java.util.HashMap;
import java.util.Set;

public class EmployeeManagement {
	public HashMap<Integer, Employee> emps = new HashMap<Integer, Employee>();
	public void addEmployee(int empID, String name, long salary) {
		Employee emp = new Employee(name, salary);
		emps.put(empID, emp);
	}
	public boolean updateEmployee(int empID, String name, long salary) {
		if (!emps.containsKey(empID))
			return false;
		
		Employee emp = new Employee(name, salary);
		emps.put(empID, emp);		
		return true;
	}
	public boolean deleteEmployee(int empID) {
		if(!emps.containsKey(empID))
			return false;
		emps.remove(empID);
		return true;
	}
	public void displayAll() {
		Set<Integer> keys = emps.keySet();
		for(int key : keys) {
			System.out.println("EmpID: " + key);
			emps.get(key).display();
		}
	}
}