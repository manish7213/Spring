package com.manish.spring;

public class Triangle implements ShapeInterface{

	//private String type;

	Point p1,p2,p3;



	public Point getP1() {
		return p1;
	}



	public void setP1(Point p1) {
		this.p1 = p1;
	}



	public Point getP2() {
		return p2;
	}



	public void setP2(Point p2) {
		this.p2 = p2;
	}



	public Point getP3() {
		return p3;
	}



	public void setP3(Point p3) {
		this.p3 = p3;
	}



	public void draw()
	{
		System.out.println("Triangle Drawn");
		System.out.println("pointA("+getP1().getX()+","+getP1().getY()+")");
		System.out.println("pointB("+getP2().getX()+","+getP2().getY()+")");
		System.out.println("pointC("+getP3().getX()+","+getP3().getY()+")");
	}



	/*	public void destroy() throws Exception {
		System.out.println("Bean distroyed");

	}



	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean initialized");

	}*/

/*	public void  MyInit() {
		System.out.println("MyInit Called");

	}

	public void  cleanUp() {
		System.out.println("cleanup Called");

	}*/

}
