package com.neosoft.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Test02 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.contains(2));
		System.out.println(v.indexOf(2));
		System.out.println(v.remove(2));
		System.out.println(v.remove((Object)2));
		System.out.println(v);
		v.add(1, 2);
		System.out.println(v);
		v.set(1, null);
		System.out.println(v);
		
		//================
		Stack<Integer> st=new Stack<>();
		/*	st.push(1);
			st.push(2);
			st.push(3);*/
		st.add(1);
		st.add(2);
		st.add(3);
		System.out.println(st);
		System.out.println(st.peek());
		
		//=======================
		System.out.println("===========");
		Set<Object> ss=new HashSet<>();
		
		ss.add(1);
		ss.add(1);
		ss.add(null);
		ss.add(null);
		ss.add(new Exp(1,2));
		ss.add(new Exp(1,2));
		System.out.println(ss);
		System.out.println("===========");
		//=================
		/*Set<Exp> ts=new TreeSet<>();
		
		ts.add(new Exp(1,2));
		ts.add(new Exp(2,3));
		System.out.println(ts);*/
		Set<Exp> ts=new TreeSet<>((o1,o2)-> {
				return o1.getX()-o2.getX();
		});
		
		ts.add(new Exp(1,2));
		ts.add(new Exp(2,3));
		System.out.println(ts);
		
		//==================
		System.out.println("===============");
		HashMap<Object,Object> hm=new HashMap<>();
		hm.put("a", "abc");
		hm.put("a", "bbc");
		hm.put(new String("a"), "cbc");
		System.out.println(hm);
		
		System.out.println("a".hashCode());
		System.out.println(hm.get("a"));
		
		
		
	}
}
//class Exp implements Comparable<Exp>{
class Exp implements Comparable<Exp>{
	private int x;
	private int y;
	public Exp() {}
	
	public Exp(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Example [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Exp e) {
			return this.x==e.x && this.y==e.y;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.x+this.y;
	}
	@Override
	public int compareTo(Exp o) {
		return this.x-o.x;
	}
	
}
