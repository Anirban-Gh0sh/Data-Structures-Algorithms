import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collections_set
{
    public void hashSet()
    {
        System.out.println("\nHash Set");
        //does not maintains insertion order
        Set<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println(hs);
        hs.remove(40);
        System.out.println(hs);
        System.out.println(hs.contains(30));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        /*Enhanced loop to traverse elements
        *since get() is not supported asit is not indexed but hashed*/
        for(Integer element:hs)
        {
            System.out.print(element+" ");
        }
        System.out.println();
        hs.clear();
        for(Integer element:hs)
        {
            System.out.print(element+" ");
        }
    }
    public void linkedHashSet()
    {
        System.out.println("\nLinked Hash Set");
        //Maintains insertion order
        Set<Integer> lhs=new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);
        System.out.println(lhs);
        for(Integer element:lhs)
        {
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println(lhs.size());
        System.out.println(lhs.contains(40));
        System.out.println(lhs.isEmpty());
        lhs.clear();
        System.out.println(lhs);
    }
    public void treeSet()
    {
        System.out.println("\nTree set");
        //sorts elements automatically
        Set<Integer> ts=new TreeSet<>();
        ts.add(50);
        ts.add(20);
        ts.add(60);
        ts.add(90);
        ts.add(0);
        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.contains(40));
        for(Integer element:ts)
        {
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println(ts.isEmpty());
        ts.clear();
        
    }
    public static void main(String args[])
    {
        Collections_set s=new Collections_set();
        s.hashSet();
        s.linkedHashSet();
        s.treeSet();
    }
}
