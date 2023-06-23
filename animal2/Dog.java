package com.sp.project0623.animal2;

//this란? 레퍼런스 변수이다.
//단, 변수명은 이미 java 프로그램에서 정해져 있다.
public class  Dog{
	String name;

	public void run(String name){
		this.name="난 강아지";
	}

	public static void main(String[] args){
		Dog d1=new Dog();
		Dog d2=new Dog();
		Dog d3=new Dog();
		
		this.name="둘리";
	}
}
