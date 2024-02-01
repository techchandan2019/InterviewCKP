package com.neosoft.test;

public class CustomCollection {
	
	private Object[] elementCollection;
	private int elementCount;
	
	public CustomCollection() {
		elementCollection=new Object[10];
		elementCount=0;
	}
	public int size() {
		return elementCount;
	}
	public int capacity() {
		return elementCollection.length;
	}
	private void increaseCapacity() {
		Object[] newColl=new Object[capacity()*2];
		for(int i=0;i<capacity();i++) {
			newColl[i]=elementCollection[i];
		}
		elementCollection=newColl;
	}
	public void add(Object obj) {
		if(size()==capacity())
			increaseCapacity();
		elementCollection[elementCount++]=obj;
	}
	public String toString() {
		if(size()==0)
			return "[]";
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<size();i++) {
			sb.append(elementCollection[i]);
			sb.append(", ");
		}
		int start=sb.lastIndexOf(",");
		int end=start+2;
		sb.delete(start, end);
		sb.append("]");
		return sb.toString();
	}
	public int indexOf(Object obj) {
		if(obj==null) {
			for(int i=0;i<capacity();i++) {
				if(elementCollection[i]==null)
					return i;
			}
		}else {
			for(int i=0;i<capacity();i++) {
				if(obj.equals(elementCollection[i]))
					return i;
			}
		}
		return -1;
	}
	public Object remove(int index) {
		Object obj=get(index);
		for(int i=index;i<size();i++) {
			elementCollection[i]=elementCollection[i+1];
		}
		elementCollection[size()-1]=null;
		elementCount--;
		return obj;
	}
	public Object get(int index) {
		checkIndex(index);
		return elementCollection[index];
	}
	private void checkIndex(int index) {
		if(index<0 || index >size())
			throw new IndexOutOfBoundsException("index");
	}

}
