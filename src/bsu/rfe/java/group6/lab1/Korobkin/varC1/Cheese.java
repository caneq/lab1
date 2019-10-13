package bsu.rfe.java.group6.lab1.Korobkin.varC1;

public class Cheese extends Food { 

	public Cheese() { 
		super("—ыр"); 
	} 

	public int calculateCalories() {
		return 60;
	}
	public String toString() { 
		return super.toString() + ", калорийность : " + calculateCalories() + " кал" ; 
	}
} 
