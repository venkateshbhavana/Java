/*
 * 3. Create a Java Application where we have a Product class with id, name and price
as private fields, generate setters and getters and constructor injection on these
private fields. From a different class Test, create a Priority Queue and add product
data into this object. Display products in decreasing order based on price.
 */

import java.util.*;
import java.util.Scanner;

class Product
{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
 class Pqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		PriorityQueue<Product> p=new PriorityQueue<>((o1,o2)->{return -(int)(o1.getPrice()-o2.getPrice());});
		for(int i=1;i<=3;i++)
		{
			Product o=new Product(sc.nextInt(),sc.next(),sc.nextFloat());
			p.add(o);
		}
		
		for(Product e:p)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getPrice());
		}
		
		while (!p.isEmpty()) {
            Product e = p.poll(); //  poll() removes every time 1st highest element in queue and returns it which is sorted.
            System.out.println(e.getId() + " " + e.getName() + " " + e.getPrice());
        }

	}

}
