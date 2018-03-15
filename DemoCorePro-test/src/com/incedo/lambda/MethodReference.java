package com.incedo.lambda;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.forEach(MethodReference::print);
		list.forEach(new MethodReference()::printOther);

	}
	
	public static void print(String str){
		System.out.println(str);
	}
	
	public void printOther(String str){
		System.out.println(" "+str);
	}

}
