package com.neosoft.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test13HashMap {

	public static void main(String[] args) {
		Map map=new HashMap();
		/*map.put("a",1);
		map.put("a",2);
		map.put(97,3);*/
		
		/*String s="b";
		String s2=new String("b");
		map.put(s,4);
		map.put(s2,5);*/
	
		map.put(new Student(101,"chandan"), 1);
		map.put(new Student(101,"chandan"), 2);
		
		System.out.println(map);
	}
}
class Student{
	private Integer id;
	private String name;
	public Student() {
	}
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s=(Student)obj;
			return this.id==s.id;
		}
		return false;
	}
	
	
	
	
}
