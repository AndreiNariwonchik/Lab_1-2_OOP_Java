package MyFirstClasses;

/**
 * Created by andre on 13.02.2017.
 */
public class Employee extends Human
{
    private String WorkPlace;
    private  double Salary;

    public Employee(String name, int age, String workPlace, double salary)
    {
        super(name,age);
        Salary = salary;
        WorkPlace = workPlace;
    }

    @Override
    protected void humansInfo()
    {
        System.out.printf("Name: \"%s\"\nAge: %s\nWorkplace: \"%s\"\nSalary: %s\n\n", super.getName(), super.getAge(),WorkPlace, Salary);
    }
}
