import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Collections_maps
{
    public void hashMap()
    {
        Map<Integer,String> hm=new HashMap<>();
        hm.put(9,"A");
        hm.put(2,"B");
        hm.put(3,"C");
        hm.put(4,"D");
        System.out.println(hm);
        System.out.println(hm.get(2));
        hm.remove(2);
        System.out.println(hm);
        System.out.println(hm.containsKey(3));
        System.out.println(hm.containsValue("D"));
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
    public void linkedHashMap()
    {
        Map<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(1,"A");
        lhm.put(5,"E");
        lhm.put(3,"C");
        lhm.put(4,"D");
        System.out.println(lhm);
        System.out.println(lhm.get(2));
        lhm.remove(2);
        System.out.println(lhm);
        System.out.println(lhm.containsKey(3));
        System.out.println(lhm.containsValue("D"));
        System.out.println(lhm.size());
        System.out.println(lhm.isEmpty());
        System.out.println(lhm.keySet());
        System.out.println(lhm.values());
        lhm.clear();
        System.out.println(lhm.isEmpty());
    }
    public void treeMap()
    {
        Map<Integer,String> tm=new TreeMap<>();
        tm.put(1,"A");
        tm.put(5,"E");
        tm.put(3,"C");
        tm.put(2,"D");
        System.out.println(tm);
        System.out.println(tm.get(2));
        tm.remove(2);
        System.out.println(tm);
        System.out.println(tm.containsKey(3));
        System.out.println(tm.containsValue("D"));
        System.out.println(tm.size());
        System.out.println(tm.isEmpty());
        System.out.println(tm.keySet());
        System.out.println(tm.values());
        tm.clear();
        System.out.println(tm.isEmpty());
    }
    public static void main(String args[])
    {
        Collections_maps m=new Collections_maps();
        m.hashMap();
        m.linkedHashMap();
        m.treeMap();
    }
}
