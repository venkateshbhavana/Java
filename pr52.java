/* 2.Create a java application where we have a package named "main" it contains one concrete class with one parameterized constructor static method with parameter and return type, one abstract class with one parameterized constructor one abstract method with parameter and return type with respect to this package we have one sub-package it contains one interface with an abstract method with parameter and return type then access all these features into the class of separate package provide functionality for abstract methods then invoke all under the main method by providing dynamic inputs. */

package main1;

import java.util.*;

public class pr52
{
   public static Scanner sc=new Scanner(System.in);
    public pr52(boolean a)
    {
       System.out.println(a);
    }
    public static int m1(float a)
        {
          System.out.println(a);
          return sc.nextInt();
        }
}