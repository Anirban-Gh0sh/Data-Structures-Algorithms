import java.util.Scanner;
public class stringSearchingForWord
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String st=in.nextLine();
        System.out.println("Enter word");
        String key_word=in.nextLine();
        String words[]=st.split("\\s+");
        int c=0;
        for(String word:words)
        {
            //System.out.print(word+",");
            if(key_word.equalsIgnoreCase(word))
            {
                c=c+1;
            }
        }
        if(c>0)
        System.out.println("Word '"+key_word+"' found in the string "+c+" times");
        else
        System.out.println("Word '"+key_word+"' not found in the string");
    }
}
