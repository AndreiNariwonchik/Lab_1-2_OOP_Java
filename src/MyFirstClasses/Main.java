package MyFirstClasses;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
            Learner ler = new Learner("lol", 10, "ChuhowoSH", 4, 2, 3, 4, 5, 4);
            ler.humansInfo();

            Student st = new Student("kek",20,"BSUIR", 80,9,10,4,6,9 );
            st.humansInfo();

            Employee emp = new Employee("dad", 50, "BSU", 1000);
            emp.humansInfo();


        LinkedList<Human> Humans = new LinkedList<>();
        Humans.append(ler);
        Humans.insertBefore(Humans.getFirst(),st);
        Humans.append(emp);
        Humans.remove(Humans.getLast());
        Humans.insert(emp);

        LinkedList.Node node = Humans.getFirst();
        while (node != null)
        {
            System.out.printf("Name: %s;\tAge: %d\n", node.getItem().getName(),node.getItem().getAge());
            node = node.getNext();
        }
        Humans.clear();
        Humans = null;

        Runtime.getRuntime().gc();
        Thread.sleep(3000);
        System.out.printf("\nDestroyed Nodes Count: %d", LinkedList.DestroyedNodesCount);
    }
}
