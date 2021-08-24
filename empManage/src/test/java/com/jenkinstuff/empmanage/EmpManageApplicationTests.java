package com.jenkinstuff.empmanage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmpManageApplicationTests {

	@Test
	void contextLoads() {
		EmployeeManagement E = new EmployeeManagement();
		E.addEmployee(1, "vishnu", 10);
		assertEquals(E.emps.get(1).getName(), "vishnu");
		assertEquals(E.emps.get(1).getSalary(), 10);		
		E.updateEmployee(1, "vishnu", 100);
		assertEquals(E.emps.get(1).getSalary(), 100);
		E.displayAll();
		assertEquals(E.deleteEmployee(1), true);
	}

}
