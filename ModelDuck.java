package com.rifatiqbal.strategy_pattern;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehaviour = new FlyNoWings();
		quackBehaviour = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a model duck");
	}

}
