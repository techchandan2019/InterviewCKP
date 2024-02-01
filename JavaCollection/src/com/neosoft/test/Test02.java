package com.neosoft.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test02 {

	public static void main(String[] args) {
		List<Integer> li1=new ArrayList<>();
		
		li1.add(1);
		li1.add(2);
		li1.add(3);
		Iterator<Integer> it1 = li1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
//			li1.add(4);//RE:ConcurrentModificationException
		}
		System.out.println("=========");
		//============
		List<Integer> li2=new CopyOnWriteArrayList<>();
		li2.add(1);
		li2.add(2);
		li2.add(3);
		Iterator<Integer> it2 = li2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
			li2.add(4);//No RE
		}
		
		//==================
		System.out.println("=========");
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		
		Set<Entry<Integer,String>> entSet = map.entrySet();
		System.out.println(entSet);
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		Collection<String> values = map.values();
		System.out.println(values);
		
	}
}
