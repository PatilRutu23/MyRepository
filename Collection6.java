import java.util.*;

class Collection6
{
    public static void main(String arg[])   
    {
        Stack <Character>sobj = new Stack<Character>();

        sobj.push('a');
        sobj.push('b');
        sobj.push('c');
        sobj.push('d');
        sobj.push('e');

        System.out.println("Elements of stack : "+sobj);

        System.out.println("Poped element is : "+sobj.pop());//pop =last and removed

        System.out.println("Elements of stack : "+sobj);

    }
}
