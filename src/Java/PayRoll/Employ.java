package Java.PayRoll;

abstract public class Employ
{
    private String name;
    private int Id;
    public Employ(String name , int Id)
    {
        this.name = name;
        this.Id = Id;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return Id;
    }
    public abstract double calculateSalary();
    @Override
    public String toString()
    {
        return "Employ [name = "+name+" , Id = "+Id+" , salary = "+calculateSalary()+"]";
    }

}
