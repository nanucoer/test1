package IntArray;

public class ArrayPrograms {
    int arr[]=new int[]{101,99,50,201,304,401,199,201,99,39};
    public void duplicate() {
        System.out.println("duplicate element is given array is");
for(int i=0;i<=arr.length-1;i++)
{
    for(int j=i+1;j<=arr.length-1;j++)
    {
        if (arr[i]==arr[j])
        {
            System.out.println(+arr[j]);
        }
    }
}
    }
    public void reverse()
    {
        System.out.println("Reverse array is");
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.print(+arr[i]+",");
        }
    }
    public void large()
    {

    }
}
