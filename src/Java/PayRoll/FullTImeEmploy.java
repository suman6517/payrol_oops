package Java.PayRoll;

public class FullTImeEmploy extends Employ
{
    private double monthlySalary;
    public FullTImeEmploy(String name , int Id, double monthlySalary)
    {
        super(name , Id);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary()
    {
        return monthlySalary;
    }

}
