package assignment;

import java.util.ArrayList;
import java.util.List;

public class Payroll {

	/**
	 * Used to calculate tax
	 * 
	 * @param emp
	 * @return
	 */
	public float calculateTax(Employee emp) {
		return getValueFromPercentage(emp.getBasicSalary(), 8f);
	}

	/**
	 * Used to calculate PF
	 * 
	 * @param emp
	 * @return
	 */
	public float calculatePf(Employee emp) {
		return getValueFromPercentage(emp.getBasicSalary(), 12f);
	}

	/**
	 * Used to generate salary slip
	 * 
	 * @param emp
	 * @return
	 */
	public PayrollModel salarySlip(Employee emp) {
		PayrollModel salarySlip = new PayrollModel();

		var tax = calculateTax(emp);
		var pf = calculatePf(emp);
		float total = emp.getBasicSalary() + emp.getBonus() + emp.getCompensation() - tax - pf;
		salarySlip.setBasicSalary(emp.getBasicSalary());
		salarySlip.setBonus(emp.getBonus());
		salarySlip.setCompensation(emp.getCompensation());
		salarySlip.setTax(tax);
		salarySlip.setPf(pf);
		salarySlip.setTotal(total);
		salarySlip.setName(emp.getEmployeeName());
		salarySlip.setId(emp.getEmployeeId());

		return salarySlip;
	}

	/**
	 * Used to generate salary slip for an organization
	 * 
	 * @param org
	 * @return
	 */
	public ArrayList<PayrollModel> salarySlipForOrg(MetaCubeOrganization org) {
		ArrayList<PayrollModel> salarySlipList = new ArrayList<PayrollModel>();

		List<Employee> employeeList = org.getAllEmployees();

		employeeList.forEach((employee) -> {
			salarySlipList.add(salarySlip(employee));
		});

		return salarySlipList;
	}

	/**
	 * Used to calculate Percentage
	 * 
	 * @param obtained
	 * @param total
	 * @return
	 */
	public float calculatePercentage(float obtained, float total) {
		return obtained * 100 / total;
	}

	/**
	 * Used to get value from percentage
	 * 
	 * @param value
	 * @param percentage
	 * @return
	 */
	public float getValueFromPercentage(float value, float percentage) {
		return (value * (percentage / 100.0f));
	}
}