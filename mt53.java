/*
 * 3. Create a java application where we have one class like Student which contains properties like id, name and marks
provide user defined values by using constructor injection and also create getter methods then create objects of
List add ids in first object and marks in second object then display ids in descending order and marks in ascending
order
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class Student
{
	int id;
	String name;
	float marks;
	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getMarks() {
		return marks;
	}
	
}
public class mt53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Float> a2=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			Student s=new Student(sc.nextInt(),sc.next(),sc.nextFloat());
			a1.add(s.getId());
			a2.add(s.getMarks());
		}
		Collections.sort(a2);
		Collections.sort(a1,Comparator.reverseOrder());
		Iterator i1=a1.iterator();
		Iterator i2=a2.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next()+" "+i2.next());
		}
		
		// or we can write another loop for printing a2 object marks 
		
		

	}

}