package verini.bcs345.labthree.fileio;

public class Employee {
	
	private String m_Name;
	private double m_HoursWorked;
	private double m_HourlyRate;
	
	public String GetName() {return m_Name;}
	public double GetHoursWorked() { return m_HoursWorked; }//get methods
	public double GetHourlyRate() { return m_HourlyRate; }
	
	public void SetName(String name) { m_Name = name; }
	public void SetHoursWorked(double hoursWorked) { m_HoursWorked = hoursWorked; }//set methods
	public void SetHourlyRate(double hourlyRate) { m_HourlyRate = hourlyRate; }
	
	//default constructor is whatever the name of the class is
	public Employee()
	{
		m_Name = "";
		m_HoursWorked = 0.0;
		m_HourlyRate = 0.0;
	}
	
	public Employee(String name, double hoursWorked, double hourlyRate)
	{
		m_Name = name;
		m_HoursWorked = hoursWorked;
		m_HourlyRate = hourlyRate;
	}
	
	public double GetPay() //GetPay is a member variable so it has access without passing in parameters
	{
		return m_HoursWorked * m_HourlyRate;		
	}
}
