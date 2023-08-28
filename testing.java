package IntArray;

public class testing {
    public static void main(String[] args) {
        String name = "Narendra Singh";
        String[] a = name.split(" ");
        int c = a.length;
        for (int i = c - 1; i >= 0; i--) {
            String d = a[i];
            for (int j=d.length()-1; j >= 0; j--) {

                System.out.print(d.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
