package my.practice;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {


        HashSet<Guest> mySet = new HashSet<Guest>();

        Guest G6 = new Guest("Prakash", "Prakash@gmail.com");
        Guest G7 = new Guest("Prakash1", "Prakash1@gmail.com");
        Guest G8 = new Guest("Prakash2", "Prakash2@gmail.com");
        Guest G9 = new Guest("Prakash3", "Prakash3@gmail.com");
        Guest G10 = new Guest("Prakash4", "Prakash4@gmail.com");


        mySet.add(G6);
        mySet.add(G7);
        mySet.add(G8);
        mySet.add(G9);
        mySet.add(G10);
        mySet.add(G10);
        //Sorted with name
        //  myQueue.forEach(a-> System.out.println(a.getName()+ " "+ a.getEmail()));

       // System.out.println(mySet.+ " "+ myQueue.peek().getEmail());
        Iterator<Guest> myIter1 = mySet.iterator();

        while(myIter1.hasNext()){
            Guest next = myIter1.next();
            System.out.println(next.getName()+ " " + next.getEmail());

        }
    }
}