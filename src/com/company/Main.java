package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        Queue myQueue = new Queue(10);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();

            if(input.contains("INSERT"))
                myQueue.insert(input.split(" ")[1]);
            else if(input.contains("REMOVE")){
                if(!myQueue.isEmpty())
                    myQueue.remove();
                else
                    System.out.println(myQueue.remove());
            }

        }


        int mySize = myQueue.size();

        for(int pointer = 0; pointer < mySize; pointer++) {
            if (mySize % 2 == 0) {
                if(pointer == mySize/2 - 1) {
                    System.out.println(myQueue.remove());
                    break;
                }
            }
            else if(pointer == mySize/2) {
                System.out.println(myQueue.remove());
                break;
            }
            myQueue.remove();

        }





    }
}
