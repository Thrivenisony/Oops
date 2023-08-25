package Composition;

public class EmpolyeeTset {
public static void main(String[] args) {
	LeaveTraker lt=new LeaveTraker(3,90,10);
	Employee em=new Employee(1, "Thriveni", 30000,lt);
	System.out.println(em);
}
}
