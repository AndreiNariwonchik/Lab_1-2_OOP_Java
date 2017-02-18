package MyFirstClasses;

/**
 * Created by andre on 12.02.2017.
 */
public final class LinkedList<T extends Human>
{
    protected static long DestroyedNodesCount;
    static{DestroyedNodesCount = 0;}

    public final class Node
    {
        private  Node(T item)
        {
            Item = item;
            Next = null;
            Prev = null;
        }
        private T Item;
        private Node Next;
        private Node Prev;

        protected void finalize()
        {
            DestroyedNodesCount++;
        }

        protected Node getNext() {return Next;}
        protected  Node getPrev() {return Prev;}
        protected  T getItem() {return Item;}
    }


    private Node First = null;
    private Node Last = null;
    private long size = 0;

    public Node getFirst() {return this.First;}
    public Node getLast() {return this.Last;}
    public long getSize() {return this.size;}

    public boolean isEmpty()
    {
        return size == 0 ? true : false;
    }

    public void clear()
    {
        this.First = null;
        this.Last = null;
        this.size = 0;
    }

    public void remove(Node node)
    {
        if(node != null)
        {
            if (node.Prev == null && node.Next != null)
            {
                node.Next.Prev = null;
                this.First = node.Next;
            }
            else if (node.Prev == null && node.Next == null)
            {
                node.Prev.Next = node.Next;
                node.Next.Prev = node.Prev;
            }
            else if(node.Prev != null && node.Next == null)
            {
                node.Prev.Next = null;
                this.Last = node.Prev;
            }
            size--;
        }
    }

    public void insertBefore(Node node, T item)
    {
        Node n = new Node(item);
        if (node != null)
        {
            if ( node.Prev == null)
            {
                this.First = n;
                n.Next = node;
                node.Prev = n;
            }
            else
            {
                node.Prev.Next = n;
                n.Prev = node.Prev.Next;
                n.Next = node;
                node.Prev = n;
            }
        }
        size++;
    }

    public  void insertAfter(Node node, T item)
    {
        Node n = new Node(item);
        if (node != null)
        {
            if(node.Next == null)
            {
                node.Next = n;
                n.Prev = node;
                this.Last = n;
            }
            else
            {
                node.Next.Prev = n;
                n.Next = node.Next.Prev;
                n.Prev = node;
                node.Next = n;
            }
            size++;
        }
    }

    //Добавить элемент в конец списка
    public void append(T item) {
        Node node = new Node(item);
        if (!isEmpty())
        {
            node.Prev = this.Last;
            this.Last.Next = node;
            this.Last = node;
        }
        else
        {
            this.First = node;
            this.Last = node;
        }
        this.size++;
    }

    //Добавить элемент в начало списка
    public void insert(T item)
    {
        Node node = new Node(item);
        if (!isEmpty())
        {
            node.Next = this.First;
            this.First.Prev = node;
            this.First = node;
        }
        else
        {
            this.First = node;
            this.Last = node;
        }
        this.size++;
    }

    protected void finalize()
    {
        System.out.print("\nLinked list were destroy!");
    }
}
