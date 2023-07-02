import java.util.Scanner;
public class stringSubstring
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String st1=in.nextLine();
        int start=0,end=3;
        System.out.println(st1.substring(start,end));
    }
}
