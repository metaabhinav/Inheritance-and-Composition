package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;


class PayrollTest {

	@Test
	void test() {
		MetaCubeOrganization objOrganization = new MetaCubeOrganization();

		Department hrDepartment = new HRDepartment();
		Department devDepartment = new DeveloperDepartment();

		Employee hrEmpOne = new HREmployee("Rahul", DepartmentsType.Hr, 1000, 100, 100);
		Employee hrEmpTwo = new HREmployee("Raj", DepartmentsType.Hr, 2000, 100, 100);

		Employee devEmpOne = new HREmployee("Ravi", DepartmentsType.Developer, 3000, 50, 0);
		Employee devEmpTwo = new HREmployee("Garvit", DepartmentsType.Developer, 4000, 50, 100);

		assertEquals(true, hrDepartment.join(hrEmpOne));
		assertEquals(true, hrDepartment.join(hrEmpTwo));
		assertEquals(false, hrDepartment.join(hrEmpTwo));

		assertEquals(2, hrDepartment.getEmployees().size());

		assertEquals(true, devDepartment.join(devEmpOne));
		assertEquals(true, devDepartment.join(devEmpTwo));
		assertEquals(false, devDepartment.join(devEmpTwo));

		assertEquals(2, devDepartment.getEmployees().size());

		assertEquals(true, objOrganization.addDepartment(hrDepartment));
		assertEquals(true, objOrganization.addDepartment(devDepartment));
		assertEquals(false, objOrganization.addDepartment(devDepartment));

		assertEquals(4, objOrganization.getAllEmployees().size());

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(devEmpOne);
		empList.add(devEmpTwo);

		assertEquals(true, devDepartment.relieve(devEmpTwo));
		assertEquals(false, devDepartment.relieve(devEmpTwo));
		
		
		assertEquals(3, objOrganization.getAllEmployees().size());

		Payroll payrollObjOne = new Payroll();
		PayrollModel salarySlipOne = new PayrollModel(hrEmpOne.getEmployeeName(), hrEmpOne.getEmployeeId(), 1000, 100,
				100, 80, 120, 1000);
		assertEquals(salarySlipOne, payrollObjOne.salarySlip(hrEmpOne));

		Payroll payrollObjTwo = new Payroll();
		PayrollModel salarySlipTwo = new PayrollModel(devEmpOne.getEmployeeName(), devEmpOne.getEmployeeId(), 3000, 50,
				0, 240, 360, 2450);

		assertEquals(salarySlipTwo.getId(), payrollObjTwo.salarySlip(devEmpOne).getId());
		
		
		
		

	}

	@Test
	void testErrorOne() {

		var error = Assertions.assertThrows(AssertionError.class, () -> {
			new HREmployee(null, DepartmentsType.Hr, 1000, 100, 100);
		});
		assertEquals("Enter employee name", error.getMessage());

	}

	@Test
	void testErrorTwo() {

		var error = Assertions.assertThrows(AssertionError.class, () -> {
			new HREmployee("Rahul", null, 1000, 100, 100);
		});
		assertEquals("Enter department", error.getMessage());

	}

	@Test
	void testErrorThree() {

		var error = Assertions.assertThrows(AssertionError.class, () -> {
			new HREmployee("Raj", DepartmentsType.Hr, 0, 100, 100);
		});
		assertEquals("Invalid input for basic salary", error.getMessage());
	}

	@Test
	void testErrorFour() {

		var error = Assertions.assertThrows(AssertionError.class, () -> {
			new HREmployee("Raj", DepartmentsType.Hr, 100, -1, 100);
		});
		assertEquals("Invalid input for bonus", error.getMessage());
	}

	@Test
	void testErrorFive() {

		var error = Assertions.assertThrows(AssertionError.class, () -> {
			new HREmployee("Raj", DepartmentsType.Hr, 110, 100, -1);
		});
		assertEquals("Invalid input for compensation", error.getMessage());
	}

}