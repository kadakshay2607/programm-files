package com.te.collection;

import java.util.Arrays;
import java.util.Iterator;

public class MyArray implements Iterable{

	private Object[] array;
	private int position;

	public MyArray(int arraySize) {
		array = new Object[arraySize];
	}

	public void add(Object e) {

		if (position >= array.length - 1) {
			increasecapacity();
		}

		array[position] = e;
		position++;

	}

	public Object get(int index) {
		return array[index];
	}

	public int size() {
		return position;
	}

	public void remove(int index) {

		for (int i = index + 1; i < array.length; i++) {
			array[i - 1] = array[i];
		}
		
		array[position] = null;
		position--;

	}

	@Override
	public String toString() {
		if (size() == 0) {
			return "[]";
		}
		String s = "[" + array[0]; // [Sam
		for (int i = 1; i < size(); i++) {

			s += "," + array[i]; // [Sam , 10 , true
		}
		s += "]"; // [Sam , 10 , true]
		return s;
	}

	private void increasecapacity() {

		Object[] temp = new Object[array.length + 5];

		System.arraycopy(array, 0, temp, 0, array.length - 1);

		array = temp;

	}

	@Override
	public Iterator iterator() {

		return new MyItr();

	}

	private class MyItr implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			return (index < position) ? true : false;
		}

		@Override
		public Object next() {

			Object object = array[index];
			index++;
			return object;
		}

	}
    }





