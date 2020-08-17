//Question3
package CipherSchool;
import java.util.*;
class Employee 
{
	int id,salary;
	String name,designation,location;
	void setEid(int id)
	{
		this.id=id;
	}
	void setEmpName(String name)
	{
		this.name=name;
	}
	void setDesignation(String designation)
	{
		this.designation=designation;
	}
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	void setLocation(String location)
	{
		this.location=location;
	}
	int getEid()
	{
		return id;
	}
	String getEmpName()
	{
		return name;
	}
	String getDesignation()
	{
		return designation;
	}
	int getSalary()
	{
		return salary;
	}
	String getLocation()
	{
		return location;
	}
	public String toString()
	 {
		 return (getEid()+" "+getEmpName()+" "+getDesignation()+" "+getSalary()+" "+getLocation());
	 }
	
}
public class Question3Assignment1 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setEmpName("Ajay");
		e1.setDesignation("General Manager");
		e1.setLocation("Bangalore");
		e1.setSalary(100000);
		Employee e2=new Employee();
		e2.setEid(2);
		e2.setEmpName("Vinay");
		e2.setDesignation("analyst");
		e2.setLocation("Noida");
		e2.setSalary(40000);
		Employee e3=new Employee();
		e3.setEid(3);
		e3.setEmpName("Atul");
		e3.setDesignation("Intern");
		e3.setLocation("Bangalore");
		e3.setSalary(15000);
		Employee e4=new Employee();
		e4.setEid(4);
		e4.setEmpName("Rohit");
		e4.setDesignation("SWD");
		e4.setLocation("Manipur");
		e4.setSalary(60000);
		Employee e5=new Employee();
		e5.setEid(5);
		e5.setEmpName("Rahul");
		e5.setDesignation("Employee");
		e5.setLocation("Mangalore");
		e5.setSalary(30000);
		Employee e6=new Employee();
		e6.setEid(6);
		e6.setEmpName("Mahesh");
		e6.setDesignation("Team Leader");
		e6.setLocation("Bangalore");
		e6.setSalary(70000);
		Employee e7=new Employee();
		e7.setEid(7);
		e7.setEmpName("Ramesh");
		e7.setDesignation("Internee");
		e7.setLocation("Hyderabad");
		e7.setSalary(12000);
		Employee e8=new Employee();
		e8.setEid(8);
		e8.setEmpName("Vishal");
		e8.setDesignation("Senior Software Developer");
		e8.setLocation("New Delhi");
		e8.setSalary(80000);
		Employee e9=new Employee();
		e9.setEid(9);
		e9.setEmpName("Sahil");
		e9.setDesignation("Data Analyst");
		e9.setLocation("Manipal");
		e9.setSalary(30000);
		Employee e10=new Employee();
		e10.setEid(10);
		e10.setEmpName("Tushar");
		e10.setDesignation("Sale");
		e10.setLocation("Meghalaya");
		e10.setSalary(20000);
		ArrayList<Employee> arr=new ArrayList<>();
		arr.add(e1);
		arr.add(e2);
		arr.add(e3);
		arr.add(e4);
		arr.add(e5);
		arr.add(e6);
		arr.add(e7);
		arr.add(e8);
		arr.add(e9);
		arr.add(e10);
		 arr.stream().forEach(cust ->System.out.println(cust.getEmpName()));
		 arr.stream().filter(cust -> cust.getSalary()>50000).forEach(cust ->System.out.println(cust.getSalary()));
		 arr.stream().filter(cust -> cust.getLocation().startsWith("M")).forEach(cust ->System.out.println(cust.getLocation()));
		 arr.stream().filter(cust -> cust.getDesignation().endsWith("e")).forEach(cust ->System.out.println(cust.getDesignation()));
		

	}

}
