package Java.PayRoll;

public class PartTimeEmploy extends Employ
{
    private int workingHours;
    private double hourlyRate;

    public PartTimeEmploy(String name , int Id, int workingHours , double hourlyRate)
    {
        super(name , Id);
        this.workingHours  = workingHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary()
    {
        double slary  = (workingHours * hourlyRate);
        return slary;
    }
}
