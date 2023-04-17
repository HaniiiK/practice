package com.day08.silsub;

import java.util.Vector;

public class MyStack<T> implements IStack {

	Vector<Integer> v = new Vector<Integer>();
	
	public MyStack() {}
	
	@Override
	public Object pop() {
		if(v.size()>0) {
			return v.remove(v.size()-1);
		}
		return null;
	}

	@Override
	public boolean push(Object ob) {
		v.add((Integer)ob);
		return true;
	}

}
