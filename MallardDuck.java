package com.rifatiqbal.strategy_pattern;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehaviour = new Quack();	
		flyBehaviour = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I look like a Mallard Duck");
	}

}
