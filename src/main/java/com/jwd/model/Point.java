package com.jwd.model;

public class Point{

	private double x;
	private double y;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	public Point(){
	}

	public void setX(double x){
		this.x = x;
	}

	public double getX(){
		return x;
	}

	public void setY(double y){
		this.y = y;
	}

	public double getY(){
		return y;
	}

	public String toString(){
		return "Point{" +"x=" + x +", y=" + y +'}';
	}
}