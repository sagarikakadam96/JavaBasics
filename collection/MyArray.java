package com.lti.collection;
import java.util.*;

public class MyArray {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(); //sized of array is not defined so it is growable awa shrinkable
		a.add("Sunday");
		a.add("Sunday"); //array list contains duplicates because it is based on requirements
		a.add("Monday");
		a.add("Tuesday");
		a.add("Wednesday");
		a.add("Thursday");
		a.add("Friday");
		a.add("Saturday");
		//System.out.println(a); //displayed in the form of array
		Collections.reverse(a);
		System.out.println("After sorting(reverse):"+a);
		Collections.sort(a);
		System.out.println("After sorting(alphabetically):"+a);
		
		Iterator<String> i=a.iterator(); //used in place of for loops or any complicated loops. It can be used for arraylist and linkedlist at the same time without needing more loops.
		
		while(i.hasNext()){ //used to show what all is added
			System.out.println(i.next());
		//for each loop is better for array
		}
		
		
		
		
		
		LinkedList<String> l = new LinkedList<String>(); //LinkedList-value with memory-used when insertion deletion is needed a lot- because it swaps with memory
		l.add("Sunday");
		l.add("Sunday"); 
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wednesday");
		l.add("Thursday");
		l.add("Friday");
		l.add("Saturday");
		l.addFirst("ABC");
		l.addLast("PQR");
		l.add(2, "XYZ");
		
		Iterator<String> i1=l.iterator();
		
		while(i1.hasNext()){ 
			System.out.println(i1.next());
		
		}
		
		HashSet<String> h = new HashSet<String>(); //duplicates are removed but displayed unordered 
		h.add("Sunday");
		h.add("Sunday");
		h.add("Monday");
		h.add("Tuesday");
		h.add("Wednesday");
		h.add("Thursday");
		h.add("Friday");
		h.add("Saturday");
		Iterator<String> i2=h.iterator(); 
		
		while(i2.hasNext()){ 
			System.out.println(i2.next());
		
		}
		
		TreeSet<String> t = new TreeSet<String>(); //sorted and unique
		t.add("Sunday");
		t.add("Sunday"); 
		t.add("Monday");
		t.add("Tuesday");
		t.add("Wednesday");
		t.add("Thursday");
		t.add("Friday");
		t.add("Saturday");
		Iterator<String> i3=t.iterator(); 
		
		while(i3.hasNext()){ 
			System.out.println(i3.next());
		
		}
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); //display comes in the order of key. Duplicate keys are removed. Null key is allowed only once.
		hm.put(1, "Monday");
		hm.put(1, "Tueday");
		hm.put(7, "Tuesday");
		hm.put(3, "Wednesday");
		hm.put(4, "Thursday");
		hm.put(5, "Friday");
		hm.put(6, "Saturday");
		hm.put(2, "Sunday");
		hm.put(null, "000"); 
		hm.put(null, "010"); 

		
		System.out.println(hm);
		
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>(); //null key is not allowed. displayed in order of keys.
		tm.put(1, "Monday");
		tm.put(2, "Tuesday");
		tm.put(7, "Wednesday");
		tm.put(8, "Thursday");
		tm.put(5, "Friday");
		tm.put(6, "Saturday");
		tm.put(3, "Sunday");
		//tm.put(null, "000"); //not allowed
		
		System.out.println(tm);
		
		
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); //null key is not allowed. key storted in reverse order and null not allowed
		ht.put(1, "Monday");
		ht.put(2, "Tuesday");
		ht.put(7, "Wednesday");
		ht.put(4, "Thursday");
		ht.put(5, "Friday");
		ht.put(6, "Saturday");
		ht.put(3, "Sunday");
		//ht.put(null, "000"); //not allowed
		
		System.out.println(ht);
		
	}

}
