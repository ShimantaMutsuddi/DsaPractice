package collection.List.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/***
 * Java te amra arraylist class use kore resizeable array r
 * functionality implement korar jnn
 *
 * Basic operations on ArrayList:
 *
 *  add elements,access,change remove
 *
 * ***/
public class LearnArrList {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Purple");
        colors.add("Green");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("Purple"));

        for(String color:colors){
            System.out.println(color);
        }
       /* String[] studentName=new String[30];
        studentName[0]="Shimanta";
        //
        //studentName[1]..studentName[30]
        //
        studentName[29]="Mutsuddi";

        // new Student
        studentName[30]="Sagar";*/

     /*   ArrayList<String> studentsName=new ArrayList<>();
        studentsName.add("Shimanta");*/
/*
        // creating list using arraylist class
        ArrayList<Integer> numbers= new ArrayList<>();

        // add elements to the lists
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //access elements from the list
        int number = numbers.get(0);
        System.out.println("accessed elements: "+number);

        // remove elements from the list

        int removedNumber=numbers.remove(0);
        System.out.println("Removed Element: " + removedNumber);
        System.out.println(" Elements : " + numbers);

        numbers.set(2,6);

        System.out.println(" Modified Elements : " + numbers);

        //iterate  using for each loop

        for (int eachNumber: numbers){
            System.out.print(eachNumber+" ");
        }*/







    }
}
