package assignment;

import java.util.Objects;

public class PayrollModel {

	private String name;
	private int id;
	private float basicSalary;
	private float bonus;
	private float compensation;
	private float tax;
	private float pf;
	private float total;

	/**
	 * Default constructor
	 */
	public PayrollModel() {
		super();
	}
	
	

	/**
	 * @param name
	 * @param id
	 * @param basicSalary
	 * @param bonus
	 * @param compensation
	 * @param tax
	 * @param pf
	 * @param total
	 */
	public PayrollModel(String name, int id, float basicSalary, float bonus, float compensation, float tax, float pf,
			float total) {
		this.name = name;
		this.id = id;
		this.basicSalary = basicSalary;
		this.bonus = bonus;
		this.compensation = compensation;
		this.tax = tax;
		this.pf = pf;
		this.total = total;
	}

	


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the basicSalary
	 */
	public float getBasicSalary() {
		return basicSalary;
	}

	/**
	 * @param basicSalary the basicSalary to set
	 */
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	/**
	 * @return the bonus
	 */
	public float getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	/**
	 * @return the compensation
	 */
	public float getCompensation() {
		return compensation;
	}

	/**
	 * @param compensation the compensation to set
	 */
	public void setCompensation(float compensation) {
		this.compensation = compensation;
	}

	/**
	 * @return the tax
	 */
	public float getTax() {
		return tax;
	}

	/**
	 * @param tax the tax to set
	 */
	public void setTax(float tax) {
		this.tax = tax;
	}

	/**
	 * @return the pf
	 */
	public float getPf() {
		return pf;
	}

	/**
	 * @param pf the pf to set
	 */
	public void setPf(float pf) {
		this.pf = pf;
	}

	/**
	 * @return the total
	 */
	public float getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(float total) {
		this.total = total;
	}



	@Override
	public int hashCode() {
		return Objects.hash(basicSalary, bonus, compensation, id, pf, tax, total);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PayrollModel other = (PayrollModel) obj;
		return Float.floatToIntBits(basicSalary) == Float.floatToIntBits(other.basicSalary)
				&& Float.floatToIntBits(bonus) == Float.floatToIntBits(other.bonus)
				&& Float.floatToIntBits(compensation) == Float.floatToIntBits(other.compensation) && id == other.id
		 && Float.floatToIntBits(pf) == Float.floatToIntBits(other.pf)
				&& Float.floatToIntBits(tax) == Float.floatToIntBits(other.tax)
				&& Float.floatToIntBits(total) == Float.floatToIntBits(other.total);
	}



	
	

}