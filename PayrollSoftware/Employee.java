package assignment;



	/**
	 * <h1>Employee
	 * <h1>This abstract class store all basic information about an employee
	 * 
	 * @author Abhinav
	 * @since 2022-10-27
	 */
	public abstract class Employee {

		private int employeeId;
		private String employeeName;
		private DepartmentsType department;
		private float basicSalary;
		private float bonus;
		private float compensation;

		/**
		 * @param employeeId
		 * @param employeeName
		 * @param department
		 * @param basicSalary
		 * @param bonus
		 * @param compensation
		 */
		public Employee(int employeeId, String employeeName, DepartmentsType department, float basicSalary, float bonus,
				float compensation) {
			if (employeeName == null || employeeName == "")
				throw new AssertionError("Enter employee name");

			if (department == null)
				throw new AssertionError("Enter department");

			if (basicSalary <= 0f)
				throw new AssertionError("Invalid input for basic salary");

			if (bonus < 0f)
				throw new AssertionError("Invalid input for bonus");

			if (compensation < 0f)
				throw new AssertionError("Invalid input for compensation");

			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.department = department;
			this.basicSalary = basicSalary;
			this.bonus = bonus;
			this.compensation = compensation;
		}

		/**
		 * @return the employeeId
		 */
		public int getEmployeeId() {
			return employeeId;
		}

		/**
		 * @return the employeeName
		 */
		public String getEmployeeName() {
			return employeeName;
		}

		/**
		 * @return the department
		 */
		public DepartmentsType getDepartment() {
			return department;
		}

		/**
		 * @return the basicSalary
		 */
		public float getBasicSalary() {
			return basicSalary;
		}

		/**
		 * @return the bonus
		 */
		public float getBonus() {
			return bonus;
		}

		/**
		 * @return the compensation
		 */
		public float getCompensation() {
			return compensation;
		}

	}

