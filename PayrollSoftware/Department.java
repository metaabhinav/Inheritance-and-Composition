package assignment;

import java.util.List;
import java.util.Objects;

/**
	 * <h1>Department<h1>
	 * This abstract class has method join , relieve , getEmployee 
	 * 
	 * @author Abhinav
	 * @since 2022-10-27
	 */
	public abstract class Department {

		/*
		 * Type of department
		 * 
		 * @link payroll.classes.DepartmentsType
		 */
		public DepartmentsType departmentName;

		/*
		 * Employee list
		 */
		public List<Employee> employeeList;

		/*
		 * This method is used to add new employee to department
		 * 
		 * @param Employee : employee object
		 * 
		 * @return boolean : true if successful else false
		 */
		public abstract boolean join(Employee employee);

		/*
		 * This method is used to relieve employee from department
		 * 
		 * @param Employee : employee object
		 * 
		 * @return boolean : true if successful else false
		 */
		public abstract boolean relieve(Employee employee);

		/*
		 * This method is used to get all employees
		 * 
		 * @return List<Employee> : all employee list
		 */
		public abstract List<Employee> getEmployees();

		@Override
		public int hashCode() {
			return Objects.hash(departmentName, employeeList);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Department other = (Department) obj;
			return departmentName == other.departmentName && Objects.equals(employeeList, other.employeeList);
		}

	}

