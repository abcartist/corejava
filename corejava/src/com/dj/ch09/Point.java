package com.dj.ch09;

public class Point<T extends Number> {
	private T x;
	private T y;
	
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
}
