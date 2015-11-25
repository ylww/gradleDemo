package com.tutorial.app;


import com.tutorial.api.HelloAPI;

public class Main{
	public static void main(String[] args){
		System.out.println(HelloAPI.invokeHello("world"));
	}
}