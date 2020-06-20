package verini.bcs345.labthree.fileio;

public class Driver {

	public static void main(String[] args) {
		Employee e;
		e = new Employee(); // calls default constructor
		e.SetName("Rose");
		e.SetHourlyRate(100);
		e.SetHoursWorked(20);
		System.out.printf("%s %.2f\n",e.GetName(), e.GetPay());
		
		Employee e2 = new Employee ("Jane", 50, 20);
		System.out.printf("%s %.2f\n",e2.GetName(), e2.GetPay());
		

	}

}
