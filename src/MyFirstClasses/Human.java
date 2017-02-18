package MyFirstClasses;


/**
 * Created by andre on 12.02.2017.
 */
public abstract class Human
{
    private  String Name;
    private  int Age;

    public Human(String name, int age)
    {
        Name = name;
        Age = age;
    }

    protected String getName(){return  Name;}
    protected int getAge(){return Age;}
    protected  void setAge(int age){Age = age;}

    protected abstract void humansInfo();
}
