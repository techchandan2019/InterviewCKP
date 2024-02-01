package com.neosoft.collection;

public class DemoCollection {
	
	private Object[] data;
	private int index;
	public DemoCollection() {
		this.data=new Object[10];
		this.index=0;
	}
	public void add(Object n) {
		if(size()==capacity())
			increaseSize();
		
		data[index++]=n;
		
	}
	private void increaseSize() {
		Object[] newArr=new Object[capacity()*2];
		for(int i=0;i<capacity();i++) {
			newArr[i]=data[i];
		}
		data=newArr;
	}
	public int size() {
		return index;
	}
	public int capacity() {
		return data.length;
	}
	public String toString() {
		if(size()==0)
			return "[]";
		
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<size();i++) {
			sb.append(data[i]);
			sb.append(" ,");
		}
		sb.append("]");
		int start=sb.lastIndexOf(",");
		int end=start+1;
		sb.delete(start, end);
		
		return sb.toString();
		
	}
	public int indexOf(Object obj) {
		if(obj==null) {
			for(int i=0;i<size();i++) {
				if(data[i]==null)
					return i;
			}
		}else {
			for(int i=0;i<size();i++) {
				if(obj.equals(data[i]))
					return i;
			}
		}
		return -1;
	}
	public boolean contains(Object obj) {
		
			return indexOf(obj)>=0;
	}
	public Object get(int index) {
		checkIndex(index);
		
		return data[index];
	}
	private void checkIndex(int index) {
		if(index<0 && index>size())
			throw new IllegalArgumentException("index is not valid");
	}
	public Object remove(int position) {
		Object obj=get(position);
		int i=position;
		for(;i<size()-1;i++) {
			data[i]=data[i+1];
		}
		data[i]=null;
		index--;
		return obj;
	}
	
	
	
}
