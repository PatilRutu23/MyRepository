import java.util.*;

class Collection3
{
    public static void main(String arg[])   
    {
        LinkedList <Book>lobj = new LinkedList<Book>();

        lobj.add(new Book("Let us C",400));
        lobj.add(new Book("Data Structures",580));
        lobj.add(new Book("C++ programming",980));
        lobj.add(new Book("Angular web development",790));

        Iterator iobj = lobj.iterator();
        //class Iterator iobj = lobj.iterator();//method
        Book bref = null;

        System.out.println("Elements of linked list are :");

        while(iobj.hasNext())
        {
            bref = (Book)iobj.next();
            bref.Display();
        }
        lobj.clear();
    }

}
class Book
{
    public String Name;
    public int Price;

    public Book(String s, int i)
    {
        this.Name = s;
        this.Price = i;
    }

    public void Display()
    {
        System.out.println("Book name : "+this.Name+" Price : "+this.Price);
    }
}