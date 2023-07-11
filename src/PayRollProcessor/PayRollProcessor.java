package PayRollProcessor;

class Employee
{
	int days;
	int hour;
	double salary = 5000;
	String name;
	double hourlyRate;
	double hoursWorked;
	public void calculatePay( String name, int days)
	{
		System.out.println(name+" "+(salary*days));
	}
	public void calculatePay(String name, double hourlyRate, double hoursWorked )
	{
		salary = hourlyRate*hoursWorked;
		System.out.println(name+" "+salary);
	}
}

public class PayRollProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.calculatePay("Megul", 1);
		employee.calculatePay("Megul", 8,6);
	}
}
