import java.util.Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Comparator;

public class collections_Queue
{
    public void arrayDeque()
    {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        /*offer,offerFirst,offerLast,poll,pollFirst,pollLast,clear,
         * peek,contains*/
        adq.offer(10);
        adq.offer(20);
        System.out.println(adq.peek());
        System.out.println(adq);
        adq.offerFirst(30);
        System.out.println(adq);
        adq.offerLast(40);
        System.out.println(adq);
        System.out.println(adq.getFirst());
        System.out.println(adq.getLast());
        adq.poll();
        System.out.println(adq);
        System.out.println(adq.contains(10));
        adq.pollFirst();
        System.out.println(adq);
        adq.pollLast();
        System.out.println(adq);
        adq.clear();
        System.out.println(adq);
    }
    public void priorityQueue()
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        /*offer,poll,clear,peek,contains,size*/
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq.peek());
         while (pq.isEmpty()==true) {
            int element = pq.poll();
            System.out.println("Removed element: " + element);
        }
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq);
        System.out.println(pq.size());
        pq.poll();
        pq.peek();
        System.out.println(pq);
        System.out.println(pq.contains(10));
        pq.clear();
        System.out.println(pq);
        
    }
    public void linkedList()
    {
        /*offer,poll,peek,size,contains*/
        Queue<Integer> ll=new LinkedList<>();
        ll.offer(10);
        ll.offer(20);
        ll.offer(30);
        System.out.println(ll);
        ll.poll();
        System.out.println(ll);
        ll.peek();
        System.out.println(ll.contains(20));
        System.out.println(ll.size());
    }
    public void priorityqueueComparator()
    {
        Comparator<String> customComparator = Comparator.comparing(String::length);

        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(customComparator);

        // Adding elements to the priority queue
        priorityQueue1.add("Apple");
        priorityQueue1.add("Banana");
        priorityQueue1.add("Cherry");

        // Removing elements from the priority queue
        while (!priorityQueue1.isEmpty()) {
            String element = priorityQueue1.poll();
            System.out.println("Removed element: " + element);
        }
        Comparator<String> rev = Comparator.reverseOrder();

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(rev);
        
          // Adding elements to the priority queue
        priorityQueue.add("a");
        priorityQueue.add("b");
        priorityQueue.add("c");

        // Removing elements from the priority queue
        while (!priorityQueue.isEmpty()) {
            String element = priorityQueue.poll();
            System.out.println("Removed element: " + element);
        }
    }
    public static void main(String args[])
    {
       collections_Queue c_dq=new collections_Queue();
       c_dq.arrayDeque();
       c_dq.priorityQueue();
       c_dq.linkedList();
       c_dq.priorityqueueComparator();
    }
}
