package com.oguz.oop;

public abstract class Duck {

	private FlyBehavior flyBehaviour;
	private QuackBehaviour quackBehaviour;

	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	public void display(){
		
	}

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void swim() {
		System.out.println("All duck float, even decoys!");
	}

	public void setFlyBehaviour(FlyBehavior flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

}
