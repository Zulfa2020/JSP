package com.nt;
/*
class X{
	int x=10;
}
class Y extends X{
	int y=20;
}
public class Upcasting_Downcasting_Operations {

	public static void main(String[] args) {
	
	X a1=new Y();//Upcasting-->Storing subclass object in superclass reference variable.
	System.out.println("X: "+a1.x);
	//System.out.println(a1.y);//you cannot access subclass specific members with supertype ref var.
	//B b=a1;//CE,super type cannot be converted to subtype.
	
	//solution to the above problem
	Y b=(Y)a1;//Downcasting 
	System.out.println("Y: "+b.y);
	}

}
*/

/*
interface foo{}
class al implements foo{}
class be extends al{}
class Upcasting_Downcasting_Operations  extends be{
	public static void main(String[] args) {
		be x=new be();
		al a=x;
		//foo f=(Upcasting_Downcasting_Operations)x;//No CE---> but ClassCastException arises.
		foo f1=(al)x;
		be b=(be)(al)x;
		
		
	}
}
*/

/*
//to overcome classcastException we use instanceof operator.

class X{
	int x=10;
}
class Y extends X{
	int y=20;
}
class D extends X{}
public class Upcasting_Downcasting_Operations {

	public static void main(String[] args) {
		X x=new Y();//upcasting
		System.out.println(x.x);
		if(x instanceof Y) {//Instanceof Operator.
		Y y=(Y)x;//downcasting
		System.out.println(y.y);
	}
		}
		
	}
	*/

/*
//Using Super type of group of subclasses as Method parameter.
 
class X{
	int a=10;
void m1() {
		System.out.println("X: M1 method");
	}

}
class Y extends X{
	int b=20;
	void m2() {
		System.out.println("Y: M2 method");
		
	}
}
class Z extends Y{
	int c=20;
	void m4() {
		System.out.println("Z: M4 method");
		
	}
}
class D{
	int d=40;
}
class Upcasting_Downcasting_Operations  {
	
	static void m3(Object ob) {
		if(ob instanceof X) {
		X x=(X)ob;
		x.m1();
	System.out.println(x.a);
		}
		else if(ob instanceof Y){
			Y y=(Y)ob;
			y.m1();
			y.m2();
			System.out.println(y.a);
			System.out.println(y.b);
		}
		else if(ob instanceof Z){
			Z z=(Z)ob;
			z.m1();
			z.m2();
			z.m4();
			System.out.println(z.a);
			System.out.println(z.b);
			System.out.println(z.c);
		}
	}
	
	public static void main(String[] args) {
		Upcasting_Downcasting_Operations.m3(new X());
		Upcasting_Downcasting_Operations.m3(new Y());
		Upcasting_Downcasting_Operations.m3(new Z());
		Upcasting_Downcasting_Operations.m3(new D());
		
		Upcasting_Downcasting_Operations.m3(new Object());
		
	}
}
*/
	




