package org.oguz.factory;
public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() { 
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
	}
	
	@Override
	void bake(){
		System.out.println("Bake for 45 minutes at 250");
	}
	
}
