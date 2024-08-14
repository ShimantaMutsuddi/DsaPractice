package collection.List.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        /*//Linkedlist implementation of queue
        Queue<Integer> numbers= new LinkedList<>();

        // Array implementation of queue
        Queue<String> animal2= new ArrayDeque<>();

        // Array implementation of queue
        Queue<String> animal3= new PriorityQueue<>();

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: "+numbers);

        //access elements from the queue
        int accessNumber = numbers.peek();
        System.out.println("Accessed element: "+accessNumber );

        //remove elements from the queue
        int removedNumber= numbers.poll() ;
        System.out.println("removedNumber: "+removedNumber);
        System.out.println("Updated Queue: " + numbers);*/

        Queue<Person> superMarket = new LinkedList<>();

        superMarket.add(new Person("Alex",21));
        superMarket.add(new Person("shimanta",35));
        superMarket.add(new Person("mutsuddi",43));
        superMarket.add(new Person("sagar",23));

        System.out.println(superMarket.size());
        System.out.println(superMarket.peek());
        System.out.println(superMarket.poll());
        System.out.println(superMarket.size());
        System.out.println(superMarket.peek());

    }

    static record Person(String name,int age){

    }
}
