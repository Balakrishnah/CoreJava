package com.java.oops;


interface Pritable{}
class Abc implements Pritable{
	public void a(){
		System.out.println("a method");
	}
}
class Bcd implements Pritable{
	void b(){
		System.out.println("b method");
	}
}
class Call{
	public void invoke(Pritable p){
		if(p instanceof Abc){
			Abc abc = (Abc) p;
			abc.a();
		}else if(p instanceof Bcd){
			Bcd bcd = (Bcd) p;
			bcd.b();
		}
	}
}
public class InstanceOfExample1 {

	public static void main(String[] args) {
		Abc p = new Abc();
		Call call = new Call();
		call.invoke(p);
	}
}
