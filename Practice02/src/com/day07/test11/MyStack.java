package com.day07.test11;

import java.util.LinkedList;
import java.util.List;

public class MyStack<T> implements Stack<T> {

	List<T> list = new LinkedList<T>();
	
	@Override
	public T pop() {
		return list.remove(0);
	}

	@Override
	public boolean push(T ob) {
		return list.add(ob);
	}

}
