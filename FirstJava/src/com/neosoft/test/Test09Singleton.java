package com.neosoft.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test09Singleton {

	public static void main(String[] args) {
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		try {
			Class c=Class.forName("com.neosoft.test.Printer");
			Constructor[] cons = c.getDeclaredConstructors();
			cons[0].setAccessible(true);
			
			/*	try {
					Printer p3=(Printer)cons[0].newInstance();
					Printer p4=(Printer)cons[0].newInstance();
					System.out.println(p3.hashCode());
					System.out.println(p4.hashCode());
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
class Printer{
	private static Printer INSTANCE;
	private Printer() {
		if(INSTANCE!=null) {
			throw new RuntimeException("Cannot exceute private constructor");
		}
		
	}
	public static Printer getInstance() {
		if(INSTANCE==null) {
			synchronized (Printer.class) {
				if(INSTANCE==null) {
					INSTANCE=new Printer();
				}
			}
		}
		return INSTANCE;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("");
	}
	public Object readResolve() {
		return INSTANCE;
	}
}
