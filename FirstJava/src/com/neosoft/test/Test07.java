package com.neosoft.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test07 {

	public static void main(String[] args) {
		List<Employee> li=new ArrayList<>();
		li.add(new Employee(101,"abc",50000.0,10));
		li.add(new Employee(102,"bbc",20000.0,20));
		li.add(new Employee(103,"cbc",10000.0,10));
		li.add(new Employee(104,"dbc",30000.0,10));
		li.add(new Employee(105,"rbc",40000.0,20));
		
		List<Employee> li2=li.stream().sorted((l1,l2)->l1.getDept()-l2.getDept()).collect(Collectors.toList());
		System.out.println(li2);
		
		//sort by desc order by sal
		li.stream().sorted((l1,l2)->-l1.getSal().compareTo(l2.getSal())).forEach(p->System.out.println(p));
		System.out.println("================");
		//get 3rd max sal
		Employee emp=li.stream().sorted((l1,l2)->-l1.getSal().compareTo(l2.getSal())).skip(2).findFirst().get();
		System.out.println(emp);
		
		System.out.println("================");
		Map<Integer,Double> map1=li.stream().collect(Collectors.groupingBy(p->p.getDept(),Collectors.averagingDouble(p->p.getSal())));
		System.out.println(map1);
		
		
	}
}
class Employee{
	
	private Integer id;
	private String name;
	private Double sal;
	private Integer dept;
	
	public Employee() {
	}

	public Employee(Integer id, String name, Double sal, Integer dept) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
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

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Integer getDept() {
		return dept;
	}

	public void setDept(Integer dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [" + id + "," + name + ", " + sal + ", " + dept + "]";
	}
	
	
}
