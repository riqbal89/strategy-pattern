package com.rifatiqbal.strategy_pattern;

public class FlyNoWings implements FlyBehaviour {
	
	public void fly() {
		System.out.println("This duck is not flying");
	}

}
