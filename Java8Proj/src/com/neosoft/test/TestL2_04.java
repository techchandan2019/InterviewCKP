package com.neosoft.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestL2_04 {
	public static void main(String[] args) {
		Emp e1=new Emp(101,"raja","MECH",400000.0);
		Emp e2=new Emp(102,"rani","CIVIL",100000.0);
		Emp e3=new Emp(103,"ckp","MECH",130000.0);
		Emp e4=new Emp(104,"ABC","MECH",500000.0);
		Emp e5=new Emp(105,"NCC","CIVIL",300000.0);
		Emp e6=new Emp(106,"BCC","MECH",103000.0);
		Emp e7=new Emp(107,"DHK","MECH",102000.0);
		Emp e8=new Emp(108,"KLL","CIVIL",130000.0);
		Emp e9=new Emp(109,"PPP","MECH",100400.0);
		Emp e10=new Emp(110,"CCC","CSE",700000.0);
		List<Emp> li=new ArrayList<>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		li.add(e5);
		li.add(e6);
		li.add(e7);
		li.add(e8);
		li.add(e9);
		li.add(e10);
		System.out.println(li);
		
		Map<String, List<Emp>> mapEmp = li.stream().collect(Collectors.groupingBy(p->p.getDept()));
		System.out.println(mapEmp);
		//dept wise max sal 
		//approch-1
		Map<String, Optional<Emp>> maxSalEmp = li.stream().collect(Collectors.groupingBy(p->p.getDept(),Collectors.maxBy(Comparator.comparingInt(p->p.getSal().intValue()))));
		System.out.println(maxSalEmp);
		
		//approch-2
		Map<String, Optional<Emp>> maxSalEmp2 = li.stream().collect(Collectors.groupingBy(p->p.getDept(),Collectors.maxBy((l1,l2)->l1.getSal().compareTo(l2.getSal()))));
		System.out.println("===="+maxSalEmp2);
	
		//================
		String s=null;
		//Optional opt=Optional.of(s);//NPE
		Optional opt=Optional.ofNullable(s);//Not throw any error
		
//		Optional opt1=Optional.of(null);//NPE
		Optional opt2=Optional.ofNullable(null);//Not throw any error
		
		Map<String, Optional<Emp>> map3 = li.stream().collect(
												Collectors.groupingBy(
														p->p.getDept(),
														Collectors.maxBy((l1,l2)->l1.getSal().compareTo(l2.getSal()))
														));
		System.out.println(map3);
		LinkedHashMap<Object, Object> map4 = map3.entrySet().stream().collect(Collectors.toMap(p->p.getKey(), x->x.getValue().get().getSal(),(t, u) -> t,()->new LinkedHashMap<Object, Object>()));
		System.out.println(map4);
		
	}
}
class Emp{
	private Integer eid;
	private String ename;
	private String dept;
	private Double sal;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	
	public Emp(Integer eid, String ename, String dept, Double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.sal = sal;
	}

	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", sal=" + sal + "]";
	}


	
}
