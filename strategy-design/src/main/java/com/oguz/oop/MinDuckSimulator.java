package com.oguz.oop;

public class MinDuckSimulator {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		mallard.setQuackBehaviour(new MuteQuack());
		mallard.performQuack();
		
		System.out.println("\n");
		
		Duck model = new ModelDuck();
		model.display();
		model.performQuack();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();

	}

}
