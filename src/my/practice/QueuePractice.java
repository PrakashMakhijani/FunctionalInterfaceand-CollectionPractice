package my.practice;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {


        Queue<Guest> myQueue = new PriorityQueue<>();

        Guest G6 = new Guest("Prakash", "Prakash@gmail.com");
        Guest G7 = new Guest("Prakash1", "Prakash1@gmail.com");
        Guest G8 = new Guest("Prakash2", "Prakash2@gmail.com");
        Guest G9 = new Guest("Prakash3", "Prakash3@gmail.com");
        Guest G10 = new Guest("Prakash4", "Prakash4@gmail.com");

        myQueue.add(G6);
        myQueue.add(G7);
        myQueue.add(G8);
        myQueue.add(G9);
        myQueue.add(G10);
        myQueue.add(G7);

        //Sorted with name
        myQueue.forEach(a-> System.out.println(a.getName()+ " "+ a.getEmail()));

        System.out.println(myQueue.peek().getName() + " "+ myQueue.peek().getEmail());



    }


}