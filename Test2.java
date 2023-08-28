package IntArray;

public class Test2 {
    static int i = 5;
    public static void main(String args[])
    {
        System.out.println(i+ ",");
        add(i);
        System.out.println(i);
    }



    public static void add(int i)
    {
        i += 7;
    }
}
