package MyFirstClasses;

import com.sun.xml.internal.fastinfoset.util.ValueArrayResourceException;

/**
 * Created by andre on 13.02.2017.
 */
public class Student extends Human
{
    private double[] Marks = null;
    private String University;
    private  double Scholarship;

    public Student(String name, int age, String university, double scholarship, double ...marks)
    {
        super(name,age);
        for ( int i = 0; i<marks.length; i++)
        {
            if (marks[i] < 0 || marks[i]>10)
                throw new ValueArrayResourceException();
        }
        Marks = marks;
        Scholarship = scholarship;
        University = university;
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
        System.out.printf("Name: \"%s\"\nAge: %s\nUniversity: \"%s\"\nAverage:%s\nScholarship: %s\n\n", super.getName(), super.getAge(), University, getAverage(), Scholarship);
    }
}
