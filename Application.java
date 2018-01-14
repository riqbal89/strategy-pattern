package com.rifatiqbal.strategy_pattern;

public class Application {
	
	/**
	 * Application class: 
	 * Main method
	 */
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("Now Executing the modelDuck Methods");

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered()); // passing a concrete implementation class into an interface (or superclass) parameter 
		model.performFly();
	}
}
