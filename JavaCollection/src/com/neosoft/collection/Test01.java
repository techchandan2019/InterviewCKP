package com.neosoft.collection;

public class Test01 {

	public static void main(String[] args) {
		DemoCollection col=new DemoCollection();
		System.out.println(col.size());
		System.out.println(col.capacity());
		col.add(1);
		col.add("a");
		col.add(null);
	
		System.out.println(col.size());
		System.out.println(col.capacity());
		System.out.println(col);
		System.out.println(col.indexOf(1));
		System.out.println(col.indexOf(null));
		System.out.println(col.contains(0));
		
		col.add(new Example(2,3));
		col.add(new Example(2,3));
		System.out.println(col);
		/*	Example e1=new Example(2,3);
			Example e2=new Example(2,3);
			
			System.out.println(e1==e2);
			System.out.println(e1.equals(e2));*/
		System.out.println(col.contains(new Example(2,3)));
		System.out.println(col.get(3));
		System.out.println(col.remove(3));
		
		System.out.println(col);
	}
}
class Example{
	private int x;
	private int y;
	public Example() {}
	
	public Example(int x, int y) {
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
		if(obj instanceof Example e) {
			return this.x==e.x && this.y==e.y;
		}
		return false;
	}
}
