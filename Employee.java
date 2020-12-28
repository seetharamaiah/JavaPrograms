
import java.util.Scanner;


public class Employee {
    int emoId;
String empName;
String empType;
Salary empSalary;
Employee(int employeeid, String employeename, String empType)
{
    this.emoId=employeeid;
    this.empName=employeename;
    this.empType=empType;
}
public void displayempInfo()
{
      empSalary=new Salary();
      System.out.println("Enter Number of Days:");
      Scanner sc=new Scanner(System.in);
      empSalary.setDay(sc.nextInt());
       System.out.println("Enter Number of Hours:");
       empSalary.setHour(sc.nextInt());
        System.out.println("Enter Number of OffDays:");
        empSalary.setOffdays(sc.nextInt());
        int TotalHoursAmount= empSalary.Calculatehourly();
        int TotalDailyAmount= empSalary.CalculateDaily();
        int TotalPermanentAmount= empSalary.CalculatePermanent();
        int BalanceAmount=(TotalDailyAmount+TotalHoursAmount)-(empSalary.getOffdays()*120);
       System.out.println("Employee Name :"+this.empName); 
       System.out.println("Employee Type: "+this.empType);
       System.out.println("Employee Salary : $"+(TotalPermanentAmount-BalanceAmount));
       
}
    public static void main(String[] args) {
      
        Employee emp=new Employee(10,"Sriram","Perminent");
        
        
        emp.displayempInfo();
    }
}
