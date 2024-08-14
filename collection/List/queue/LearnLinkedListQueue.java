package collection.List.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();

        queue.offer(12);
        queue.offer(34);
        queue.offer(55);
        queue.offer(43);
        queue.offer(12);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);




    }
}
