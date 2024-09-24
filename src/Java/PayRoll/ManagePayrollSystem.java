package Java.PayRoll;

import java.util.ArrayList;

public class ManagePayrollSystem
{
    private final ArrayList<Employ>employList;
    public ManagePayrollSystem()
    {
        employList = new ArrayList<>();
    }
    public void addEmploy (Employ employs)
    {
        employList.add(employs);
    }
    public void removeEmploy(int id)
    {
        Employ employToRemove = null;
        for(Employ  employee: employList)
        {
            if (employee .getId() == id)
            {
                employToRemove = employee;
                break;
            }
        }
        if(employToRemove != null)
        {
            employList.remove(employToRemove);
        }
    }
    public void displayEmployes()
    {
        for(Employ employees : employList)
        {
            System.out.println(employees);
        }
    }
}
