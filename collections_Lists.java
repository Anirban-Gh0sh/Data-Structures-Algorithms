import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
public class collections_Lists
{
    public void arraylist()
    {
        List<Integer> al=new ArrayList<>();
        /*add(),remove(index),remove(valueof()),size(),clear(),
        get(index),set(index,value),contains()*/
        al.add(24);
        al.add(44);
        al.add(234);
        al.add(241);
        al.add(25);
        al.set(1,2000);
        System.out.println(al); 
        System.out.println("Element at 3rd position "+al.get(3));
        System.out.println(al);
        al.remove(Integer.valueOf(241));
        System.out.println(al);
        boolean b=al.contains(Integer.valueOf(25));
        System.out.println(b);
        boolean b1=al.contains(Integer.valueOf(2005));
        System.out.println(b1);
        al.remove(Integer.valueOf(24));
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        System.out.println("size of arraylist="+al.size());
        al.clear();
        System.out.println(al);
    }
    public void linkedList()
    {
        /*add(),remove(index),remove(valueof()),size(),clear(),
        get(index),set(index,value),contains()*/
        List<Integer> l=new LinkedList<>();
        l.add(24);
        l.add(44);
        l.add(234);
        l.add(241);
        l.add(25);
        l.set(1,2000);
        System.out.println(l);
        System.out.println("Element at 3rd position "+l.get(3));
        System.out.println(l);
        l.remove(Integer.valueOf(241));
        boolean b=l.contains(Integer.valueOf(25));
        System.out.println(b);
        boolean b1=l.contains(Integer.valueOf(2005));
        System.out.println(b1);
        System.out.println(l);
        l.remove(Integer.valueOf(24));
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        System.out.println("size of linkedlist="+l.size());
        l.clear();
        System.out.println(l);
    }
    public void stack()
    {
        Stack<Integer> s=new Stack<Integer>();
        /*push,pop,peek,isEmpty,contains,indexOf,size*/
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        boolean b1=s.contains(20);
        System.out.println(b1);
        System.out.println(s.peek());
        System.out.println("Size of stack="+s.size());
        System.out.println(s.indexOf(10));
        System.out.println(s.isEmpty());
        System.out.println(s.search(20));
    }
    public void vector()
    {
        List<Integer> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println(v);
        v.remove(Integer.valueOf(10));
        System.out.println(v);
        System.out.println(v.get(0));
        System.out.println(v.size());
        System.out.println(v.contains(35));
    }
    public static void main(String args[])
    {
        collections_Lists cl=new collections_Lists();
        cl.arraylist();
        cl.linkedList();
        cl.stack();
        cl.vector();
    }
}