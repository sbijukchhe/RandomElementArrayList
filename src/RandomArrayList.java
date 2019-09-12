/*
How would you return a random item from an ArrayList?

Use Eliza or any other assignment with an array or ArrayList. Modify either assignment to use an ArrayList in place
of an array where you need to get a random element. How would you do this with an ArrayList?

Stackoverflow is your friend. See how far you can get researching on your own.

Can you move your code to a method that returns a random element?

Review the assignment on Random numbers if you need.
 */

import java.util.Random;
import java.util.ArrayList;

public class RandomArrayList {

    // Defining method to return a random element from ArrayList
    public static void findElement(ArrayList list){
        int rndElement = (int) list.get((int) (Math.random() * list.size()));
        System.out.println("\n--------------------------------------------");
        System.out.println("Getting random value from ArrayList: " + rndElement);
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args){

        int rndValue;
        int rndIndex;

        ArrayList al = new ArrayList();

        for(int i =0; i<=10; i++) {
            Random random = new Random();
            rndValue = random.nextInt(100)+1;
            al.add(rndValue);
        }
        System.out.println(al);

        // Calling findElement() method
        findElement(al);
    }
}
