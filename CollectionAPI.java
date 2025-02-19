import java.util.*;

public class CollectionAPI {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(4);
        nums.add(5);
        nums.add(9);
        System.out.println(nums.get(2));
        for(int i:nums){
            System.out.println(i);
        }
        Set<Integer> st=new HashSet<Integer>(); //TreeSet for sorted value
        st.add(6);
        st.add(4);
        st.add(5);
        st.add(9);
        st.add(6);
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Array: " + Arrays.toString(arr));
        Arrays.sort(arr);
//        Integer[] arr={10, 20, 30, 40, 50};
//        Arrays.sort(arr, Collections.reverseOrder());

        // 2. ArrayList (Dynamic Array)
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 30));
        arrayList.add(40); // Adding an element
        Collections.sort(arrayList);
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList.get(2));
        System.out.println("ArrayList: " + arrayList);


        // 3. LinkedList (Doubly Linked List)
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        linkedList.remove("Banana"); // Removing an element
        System.out.println("LinkedList: " + linkedList);

        // 4. Stack (LIFO)
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println("Stack: " + stack);
        stack.pop(); // Removing top element
        System.out.println("Stack after pop: " + stack);

        // 5. Queue (FIFO)
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("Queue: " + queue);
        queue.poll(); // Removing front element
        System.out.println("Queue after poll: " + queue);

        // 6. PriorityQueue (Min-Heap)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(50, 30, 20, 40));
        System.out.println("PriorityQueue: " + priorityQueue);
        priorityQueue.poll(); // Removing the smallest element
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        // 7. HashSet (Unordered Unique Elements)
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(10, 20, 30, 10)); // No duplicates
        System.out.println("HashSet: " + hashSet);

        // 8. LinkedHashSet (Maintains Insertion Order)
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 10));
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // 9. TreeSet (Sorted Unique Elements)
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(50, 20, 40, 30));
        System.out.println("TreeSet: " + treeSet);

        // 10. HashMap (Key-Value Pair, Unordered)
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        System.out.println("HashMap: " + hashMap);
        hashMap.remove(1);
        System.out.println("HashMap after remove: " + hashMap);

        // 11. LinkedHashMap (Maintains Insertion Order)
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // 12. TreeMap (Sorted Key-Value Pair)
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "B");
        treeMap.put(1, "A");
        treeMap.put(3, "C");
        System.out.println("TreeMap: " + treeMap);

        // 13. Deque (Double-ended Queue)
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        System.out.println("Deque: " + deque);
        deque.removeFirst();
        System.out.println("Deque after removeFirst: " + deque);

        // 14. ConcurrentHashMap (Thread-safe Map)
//        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
//        concurrentMap.put(1, "One");
//        concurrentMap.put(2, "Two");
//        System.out.println("ConcurrentHashMap: " + concurrentMap);

        // 15. BitSet (Efficient Bit Manipulation)
        BitSet bitSet = new BitSet();
        bitSet.set(1);
        bitSet.set(3);
        System.out.println("BitSet: " + bitSet);

        // 16. Graph (Adjacency List Representation using HashMap)
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 4));
        graph.put(3, Arrays.asList(1, 4));
        System.out.println("Graph (Adjacency List): " + graph);
    }
}
