import java.util.Scanner;
public class stringReverse
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String st=in.nextLine();
        int length=st.length();
        String rev="";
        for(int i=0;i<length;i++)
        {
            rev=st.charAt(i)+rev;
        }
        System.out.println("The reversed string is : "+rev);
    }
}
