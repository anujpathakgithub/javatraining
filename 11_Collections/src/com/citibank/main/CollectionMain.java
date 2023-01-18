package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
		System.out.println("Main start");

		System.out.println("1.Array List");
		List<String> nameList = new ArrayList<String>();

		System.out.println(nameList.size());
		System.out.println("Name List::" + nameList);
		
		nameList.add("Anuj");
		nameList.add("Pathak");
		nameList.add("Paritosh");
		nameList.add("Pathak");
	
		System.out.println("Name List::"+nameList.size());
		System.out.println("Name List::" + nameList);
		System.out.println("Name at Index2::" + nameList.get(2));
		System.out.println("Delete index 2::" + nameList.remove(2));
		
		System.out.println("After Remove");
		System.out.println("Name List::"+nameList.size());
		System.out.println("Name List::" + nameList);
		
		System.out.println("-------------------------");
		System.out.println("2.HashSet");
		
		Set<Integer> numberSet = new HashSet<Integer>();
		
		System.out.println("numberSet Size::" + numberSet.size());
		System.out.println("numberSet::" + numberSet);
		
		numberSet.add(11);
		numberSet.add(11);  //--> not loaded as its duplicate
		numberSet.add(12);
		numberSet.add(13);
		numberSet.add(14);
		
		System.out.println("After Adding");
		System.out.println("numberSet Size::" + numberSet.size());
		System.out.println("numberSet::" + numberSet);
		
		System.out.println("Remove NumberSet");
//		System.out.println("Remove NumberSet Index 2" + numberSet.remove(numberSet));
//		System.out.println("After Remove");
//		System.out.println("numberSet Size::" + numberSet.size());
//		System.out.println("numberSet::" + numberSet);
		
		System.out.println("---------------------");
		System.out.println("3. Treeset");
		Set<String> nameTreeSet 	= new TreeSet<String>();
		
		System.out.println("numberSet Size::" + nameTreeSet.size());
		System.out.println("numberSet::" + nameTreeSet);
		
		nameTreeSet.add("B");
		nameTreeSet.add("A");
		nameTreeSet.add("C");
		nameTreeSet.add("Z");
		nameTreeSet.add("B");
//		nameTreeSet.add(null); // Null point Exception - Not allowed as cant be sorted
		
		System.out.println("After add");
		
		System.out.println("numberSet Size::" + nameTreeSet.size());
		System.out.println("numberSet::" + nameTreeSet);
		
		System.out.println("Remove");
		System.out.println("Delete Index 2 ::" + nameTreeSet.remove("C"));
		System.out.println("After Remove");
		System.out.println("numberSet Size::" + nameTreeSet.size());
		System.out.println("numberSet::" + nameTreeSet);
		System.out.println("Main end");

	}

}
