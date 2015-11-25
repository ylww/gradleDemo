package com.tutorial.api;

import com.tutorial.common.Hello;

public class HelloAPI{
	public static String invokeHello(String world){
		return Hello.sayHello(world);
	}
}