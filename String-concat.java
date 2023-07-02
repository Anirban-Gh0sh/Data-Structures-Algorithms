import java.util.Scanner;
public class stringConcat
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string");
        String st1=in.nextLine();
        System.out.println("Enter seocnd string");
        String st2=in.nextLine();
        System.out.println(st1.concat(st2));
        //other way by keeping a space in between
        System.out.println(st1+" "+st2);
    }
}
