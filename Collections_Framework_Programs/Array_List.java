// package Collections_Framework_Programs;

import java.lang.*;
import java.util.*;

public class Array_List
{
    public static void main(String args[])
    {
       ArrayList<Integer> list = new ArrayList<>();

       list.add(10); // adding the elements into the ArrayList
       list.add(20);
       list.add(30);
       list.add(40);

       System.out.println(list); // printing all the elements

       System.out.println("THe removed element of the index 1 is : " +list.remove(1)); // removes the element at the index 1

       ArrayList<Integer> arr = new ArrayList<>();

       arr.add(100);
       arr.add(200);
       arr.add(300);
       

       System.out.println(list.addAll(arr)); // adding the elements in the list and arr 

       System.out.println(list);

       System.out.println(list.size()); // returns the size of the arraylist


       list.removeAll(arr); // removed all the elements of arr list

       System.out.println(list);

       Iterator<Integer> iterator = list.iterator(); // traverse all the elements in the list

       while(iterator.hasNext())
       {
        System.out.println(iterator.next());
       }

       System.out.println(list.get(0)); // it return the element at the index 0

       list.set(0, 1000); // replace the index element 0 with 1000

       System.out.println(list);

       System.out.println(list.contains(1000)); // returns boolean if 1000 element found

       Collections.sort(list); // sorts the element into ascending order

       System.out.println(list);

       Collections.sort(list, Collections.reverseOrder()); // sorts the element into descending order

       System.out.println(list);

       ArrayList<Integer> array =(ArrayList<Integer>)list.clone(); // shallow copy the list 

       System.out.println("This is original list" +list);
       System.out.println("This is cloned" +array);


       list.ensureCapacity(1000); // ensures the min capacity of the list is 1000

       System.out.println(list.size());

       System.out.println(list.isEmpty()); // check if the list is empty

       System.out.println(list.indexOf(1000)); // gives the index of the element 1000 

       
    }
}