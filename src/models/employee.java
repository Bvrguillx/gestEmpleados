package models;

public class employee {

	// ATRIBUTOS
	private String employeeName;
	private String employeeSurname;
	private boolean man;
	private int employeePosition;
	private String employeeAntiquity;
	private boolean employeeHolidays;
	private int employeeSalary;
	private String coments;

	// CONSTRUCTOR
	public employee(String employeeName, String employeeSurname, boolean man, int employeePosition,
			String employeeAntiquity, boolean employeeHolidays, int employeeSalary, String coments) {
		this.employeeName = employeeName;
		this.employeeSurname = employeeSurname;
		this.man = man;
		this.employeePosition = employeePosition;
		this.employeeAntiquity = employeeAntiquity;
		this.employeeHolidays = employeeHolidays;
		this.employeeSalary = employeeSalary;
		this.coments = coments;
	}

	// GETTERS AND SETTERS
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSurname() {
		return employeeSurname;
	}

	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}

	public boolean isMan() {
		return man;
	}

	public void setMan(boolean man) {
		this.man = man;
	}

	public int getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(int employeePosition) {
		this.employeePosition = employeePosition;
	}

	public String getEmployeeAntiquity() {
		return employeeAntiquity;
	}

	public void setEmployeeAntiquity(String employeeAntiquity) {
		this.employeeAntiquity = employeeAntiquity;
	}

	public boolean isEmployeeHolidays() {
		return employeeHolidays;
	}

	public void setEmployeeHolidays(boolean employeeHolidays) {
		this.employeeHolidays = employeeHolidays;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getComents() {
		return coments;
	}

	public void setComents(String coments) {
		this.coments = coments;
	}

}
