package Composition;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private LeaveTraker leavetraker;
	public Employee(int id, String name, double salary,LeaveTraker leavetraker) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.leavetraker=leavetraker;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public LeaveTraker getLeavetraker() {
		return leavetraker;
	}
	public void setLeavetraker(LeaveTraker leavetraker) {
		this.leavetraker = leavetraker;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", leavetraker=" + leavetraker + "]";
	}
	

}
