package assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>MetaCubeOrganisation
 * <h1>This class denotes as an organization
 * 
 * @author Abhinav
 * @since 2022-10-27
 */
public class MetaCubeOrganization {
	// Number of employees join MetaCube Organization
	public static int noOfEmployee = 1;

	// List of all departments in an organization
	ArrayList<Department> departmentList;

	/*
	 * Default constructor
	 */
	public MetaCubeOrganization() {
		departmentList = new ArrayList<Department>();
	}

	/*
	 * This method is used to add new Department to organization.
	 * 
	 * @param Department : Department object
	 * 
	 * @return boolean : true if successful else false
	 */

	public boolean addDepartment(Department department) {
		for (Department dep : departmentList) {
			if (dep.departmentName.equals(department.departmentName)) {
				return false;
			}
		}
		departmentList.add(department);
		return true;
	}

	/*
	 * This method is used to get all employees in an organization
	 * 
	 * @return List<Employee> : all employee list
	 */
	public List<Employee> getAllEmployees() {
		List<Employee> emplist = new ArrayList<Employee>();
		departmentList.forEach((dep) -> {
			emplist.addAll(dep.getEmployees());
		});
		return emplist;
	}
}