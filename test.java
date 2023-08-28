package IntArray;

public class test {
    public static int foo(int a, String s)
    {
         s="Yellow";
        a=a+3;
        return a;
    }



    public static void bar()
    {
        int a=4;
        String s = "Blue";
        a = foo(a,s);
        System.out.println("a="+a+"s="+s);
    }



    public static void main(String args[])
    {
        bar();
    }
}
