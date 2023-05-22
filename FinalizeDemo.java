
class FinalizeDemo
{
    public static void main(String S[])
    {
        Demo obj = new Demo(4);
        obj = null;
        System.gc();
    }
}

class Demo
{
    public int Size;
    public int Arr[];

    public Demo(int No)
    {
        System.out.println("Inside Constructor");

        Size = No;
        Arr = new int[Size];
    }
    protected void Finalize()
    {
        System.out.println("Inside finalize method");
        Arr = null;
    }
}

