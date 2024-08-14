package collection.List.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

        //minheap
        Queue<Integer> priorityQueue =new PriorityQueue<>();

        priorityQueue.offer(13);
        priorityQueue.offer(31);
        priorityQueue.offer(14);
        priorityQueue.offer(11);
        priorityQueue.offer(4);


        System.out.println(priorityQueue);

        priorityQueue.poll();
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());

        //maxheap
        Queue<Integer> pQueue =new PriorityQueue<>(Comparator.reverseOrder());
        pQueue.offer(13);
        pQueue.offer(31);
        pQueue.offer(14);
        pQueue.offer(11);
        pQueue.offer(4);
        System.out.println(pQueue);

        priorityQueue.poll();
        System.out.println(pQueue);

        System.out.println(pQueue.peek());

    }
}
