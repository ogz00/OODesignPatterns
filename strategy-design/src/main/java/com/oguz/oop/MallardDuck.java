package com.oguz.oop;

public class MallardDuck extends Duck {

	public MallardDuck() {
		setFlyBehaviour(new FlyWithWings());
		setQuackBehaviour(new Quack());
	}
	
	public void display(){
		System.out.println("I'm a Mallard Duck");
	}

}
