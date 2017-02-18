package MyFirstClasses;


import com.sun.xml.internal.fastinfoset.util.ValueArrayResourceException;

/**
 * Created by andre on 12.02.2017.
 */
public class Learner extends Human
{
    private double[] Marks = null;
    private String Schol;

    public Learner(String name, int age, String schol, double ...marks)
    {
        super(name,age);
        for ( int i = 0; i<marks.length; i++)
        {
            if (marks[i] < 0 || marks[i]>10)
            throw new ValueArrayResourceException();
        }
        Marks = marks;
        Schol = schol;
    }

    private double getAverage()
    {
        double average = 0;
        for (double x:Marks)
        {
            average+=x;
        }
        return average/Marks.length;
    }

    @Override
    protected void humansInfo()
    {
        System.out.printf("Name: \"%s\"\nAge: %s\nSchol: \"%s\"\nAverage:%s\n\n", super.getName(), super.getAge(), Schol, getAverage());
    }
}
