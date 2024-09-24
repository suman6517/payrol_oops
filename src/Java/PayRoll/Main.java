package Java.PayRoll;

public class Main
{
    public static void main(String[] args)
    {
     ManagePayrollSystem payrollSystem = new ManagePayrollSystem();
     FullTImeEmploy emp1 = new FullTImeEmploy("Suman" , 1, 70000.0);
     PartTimeEmploy emp2 = new PartTimeEmploy("Sujon" , 2, 40,300);

     payrollSystem.addEmploy(emp1);
     payrollSystem.addEmploy(emp2);
     System.out.println("About Our Employs: ");
     payrollSystem.displayEmployes();
    }
}
