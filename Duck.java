package com.rifatiqbal.strategy_pattern;

public abstract class Duck {
	
	/**
	 * Duck Class:
	 * Superclass implementation
	 */
	
	//composition
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public Duck() { // Default public constructor
		
	}
	
	public abstract void display(); // each animal has a different display, no implementation
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("all Ducks float, even decoys");
	}
	
	public void setFlyBehaviour(FlyBehaviour fly) {
		this.flyBehaviour = fly;
	}
	
	public void setQuackBehaviour(QuackBehaviour quack) {
		this.quackBehaviour = quack;
	}
	

}
