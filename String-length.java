import java.util.Scanner;
public class stringLength
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String st=in.nextLine();
        int length=st.length();
        System.out.println("Length of String is : "+length);
    }
}
