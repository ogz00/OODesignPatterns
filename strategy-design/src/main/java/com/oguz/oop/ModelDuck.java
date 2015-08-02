package com.oguz.oop;

public class ModelDuck extends Duck {
	public ModelDuck() {
		setFlyBehaviour(new FlyNoWay());
		setQuackBehaviour(new Quack());
	}

	public void display() {
		System.out.println("I'm a model duck");
	}

}
