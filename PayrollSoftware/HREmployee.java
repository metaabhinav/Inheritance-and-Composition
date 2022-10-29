package assignment;


/**
 * <h1>DeveloperEmployee<h1>
 * This class store all basic information about hr employee
 * 
 * @author Abhinav
 * @since 2022-10-27
 */
public class HREmployee extends Employee {

	/**
	 * Parameterized Constructor
	 * @param employeeName
	 * @param department
	 * @param basicSalary
	 * @param bonus
	 * @param compensation
	 * @throws AssertionError
	 */
	public HREmployee(String employeeName, DepartmentsType department, float basicSalary, float bonus,
			float compensation) throws AssertionError {
		super(MetaCubeOrganization.noOfEmployee++, employeeName, department, basicSalary, bonus, compensation);
	}

}