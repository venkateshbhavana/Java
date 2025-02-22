/*
 * Q.2). Creating a menu program with the following options:
    a. Add Element
    b. Remove Element
    c. Display Elements
    d. Exit
2. Removing an integer from an ArrayList using a new Integer().
3. Removing an integer from an ArrayList using Integer.valueOf().
 */


package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class al1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> integers=new ArrayList<>();

        while(true) //loop runs infinitly because we mentioned true
        {
            display(); //every time displays menu.
            System.out.println("Enter Your Choice: ");
            int choice=sc.nextInt();

            if(choice==1)
            {
                System.out.print("Enter an Integer: ");
                integers.add(sc.nextInt());
                System.out.println("Added");
            }
            else if(choice==2)
            {
                System.out.print("Enter an Integer to Remove: ");
                int elementToRemove=sc.nextInt();
                if(integers.contains(elementToRemove))
                {
                    integers.remove(new Integer(elementToRemove) );/*here remove method accepts only objects so we converted int element into object */
                    System.out.println("Removed");
                }
                else{
                    System.out.println("Element Not Found");
                }
            }
            else if(choice ==3)
            {
                System.out.println("Your List:  "+integers);
            }
            else if(choice==4)
            {
                System.out.println("Good Bye");
                break;
            }
            else
            {
                System.out.println("Enter a Valid Integer: ");
            }
        }

    }

    private static void display()
    {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();

    }
}
