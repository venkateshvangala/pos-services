package com.pos.services.posservices.model;

public class Test {
	@Override
	public String toString() {
		return "Test [test=" + test + ", number=" + number + "]";
	}
	public String test;
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int number;
}
