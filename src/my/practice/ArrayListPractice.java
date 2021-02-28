package my.practice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import my.practice.Guest;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Guest> myGuestList = new ArrayList<Guest>();

        Guest G1 = new Guest("Prakash", "Prakash@gmail.com");
        Guest G2 = new Guest("Prakash1", "Prakash1@gmail.com");
        Guest G3 = new Guest("Prakash2", "Prakash2@gmail.com");
        Guest G4 = new Guest("Prakash3", "Prakash3@gmail.com");
        Guest G5 = new Guest("Prakash4", "Prakash4@gmail.com");


        myGuestList.add(G1);
        myGuestList.add(G2);
        myGuestList.add(G3);
        myGuestList.add(G4);
        myGuestList.add(G5);
       // myGuestList.add(G);

//        for(int i= 0;i<myGuestList.size();i++){
//            System.out.println(myGuestList.get(i).getName()+ " " + myGuestList.get(i).getEmail());
//
//        }



        System.out.println("Print with for Each *******************");
        myGuestList.forEach(a-> System.out.println(a.getName()+ " "+ a.getEmail()));

        myGuestList.addAll(Arrays.asList(new Guest("Prakash7","Prakash7@gmail.com"),
                                         new Guest("Prakash8","Prakash8@gmail.com"),
                                        new Guest("Prakash9","prakash9@gmail.com")));

        System.out.println("After Add All *************************");
        myGuestList.forEach(a-> System.out.println(a.getName()+ " "+ a.getEmail()));


        System.out.println(myGuestList.remove(0).getName());//+ " "+ myGuestList.remove(7).getEmail());

        myGuestList.clear();
        System.out.println(myGuestList);

    }

}
