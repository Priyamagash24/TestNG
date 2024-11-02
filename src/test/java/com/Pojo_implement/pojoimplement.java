package com.Pojo_implement;

import com.pojoclass.Pojo_class;

public class pojoimplement {
	public static void main(String[] args) {
		Pojo_class p =new Pojo_class();
		System.out.println(p.get());
		System.out.println(p.set("Magash"));
		System.out.println(p.get());
	}

}