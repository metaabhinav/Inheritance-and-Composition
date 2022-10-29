package assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>DeveloperDepartment<h1>
 * This class is used to store information about Developer Employees
 * @author Abhinav
 * @since 2022-10-27
 */
public class DeveloperDepartment extends Department {

	/**
	 * Default Constructor
	 */
	public DeveloperDepartment() {
		departmentName = DepartmentsType.Developer;
		employeeList = new ArrayList<Employee>();
	}

	/*
	 * This method is used to add new employee to department.
	 *  See also {@link payroll.interfaces.Department#join(String)}.
	 * 
	 * @param Employee : employee object
	 * 
	 * @return boolean : true if successful else false
	 */

	@Override
	public boolean join(Employee employee) {
		if (employee.getDepartment() != departmentName) {
			return false;
		}
		for (Employee emp : employeeList) {
			if (emp.getEmployeeId() == employee.getEmployeeId()) {
				return false;
			}
		}
		employeeList.add(employee);
		return true;
	}

	/*
	 * This method is used to get all employees
	 * 
	 * @return List<Employee> : all employee list
	 */
	@Override
	public List<Employee> getEmployees() {
		return employeeList;
	}

	/*
	 * This method is used to relieve employee from department
	 * 
	 * @param Employee : employee object
	 * 
	 * @return boolean : true if successful else false
	 */
	@Override
	public boolean relieve(Employee employee) {
		if (employee.getDepartment() != departmentName) {
			return false;
		}

		return employeeList.remove(employee);
	}

}