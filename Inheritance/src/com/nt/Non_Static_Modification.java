package com.nt;

/*
 //Usage of this.member for modifying variables 
 class A9{
	int i=10;
	int j=20;

	void j1() {
		System.out.println(i);
		System.out.println(j);

	}
}
class B9 extends A9{
	int i=10;
	int j=20;
	void j2() {
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		System.out.println("***********************************");
		B9 b1=new B9();
		B9 b2=new B9();
	//Modifying current class variables
		b2.i=30;
		b2.j=40;


		b1.j1();
		b1.j2();

		System.out.println("*****");
		b2.j1();
		b2.j2();


	}

}
 */
/*
 //Differentiating super class variables from subclass variables

class A7{
	static int x=10;
	int y=20;
}
class B7 extends A7{
	static int x=30;
	int y=40;
}
public class B9 {
	public static void main(String[] args) {
		B7 b=new B7();
		A7 a=new B7();
		System.out.println("Before Reassigning***************");
		System.out.println("X: "+b.x+"......."+"Y: "+b.y);
		System.out.println("X: "+a.x+"......."+"Y: "+a.y);
		System.out.println(B7.x+"......."+A7.x);
		b.x=15;
		a.x=16;
		System.out.println("After Reassigning***************");
		System.out.println("X: "+b.x+"......."+"Y: "+b.y);
		System.out.println("X: "+a.x+"......."+"Y: "+a.y);
		System.out.println(B7.x+"......."+A7.x);



	}
}
 */
/*
 //Usage of super.member for modifying variables 

class A9{
	int i=10;
	int j=20;

	void j1() {
		System.out.println(i+"....."+j);


	}
}
class B8 extends A9{

	int i=30;
	int j=40;
	void j2() {
		System.out.println(i+"....."+j);


		System.out.println(super.i+"....."+super.j);


	}
	void j3() {
		 i=50;
		 j=60;

		 super.i=70;
		 super.j=80;


	}
}//class
public class Non_Static_Modification{
	public static void main(String[] args) {
		System.out.println("***********************************");
		B8 b1=new B8();
		A9 a1=b1;

		B8 b2=new B8();
		A9 a2=b2;
		b1.j3();

		System.out.println(b1.i+"...."+b1.j);//50  60
		System.out.println(a1.i+"...."+a1.j);//70  80

		System.out.println(b2.i+"...."+b2.j);//30 40
		System.out.println(a2.i+"...."+a2.j);//10 20
		System.out.println();
		b1.j1();//70   80
		b2.j1();//10  20
		System.out.println();
		b1.j2();// 50  60   70  80
		b2.j2();//30  40   10  20
		System.out.println();


	}

}
 */
/*
 
 //Upcasting and Downcasting
  
  
class I{static int i=10;}
class j extends I{static int j=20;}
class k extends j{static int k=30;}
class l{static int l=40;}
class Non_Static_Modification{
	public static void main(String[] args) {
		//all classes are sub classes of object class
		Object obj1=new I();
		Object obj2=new j();
		Object obj3=new k();
		Object obj4=new l();

		I a1=new I();
		I a2=new j();//UPcasting subclass object to super class,and storing it in superclass ref var.
		I a3=new k();
		//I a4=new l();//class l doesnt have IS-A relation with class I,hence they are siblings
		System.out.println(a1.i);
		// j1=new I();//class I doesnt have IS-A relation with class j,hence I is superclass of class j.
		j j2=new j();
		j j3=new k();
		//j j4=new l();//class l doesnt have IS-A relation with class I,hence they are siblings.

		j j1=(j)a2;//Downcasting j class object of I type to j class ref variable using casting operator.

		
		System.out.println(j1.j);
		
		k k1=(k)j3;//Downcasting k class object of I type to k class ref variable using casting operator.
		System.out.println(k1.k);
		
		
		
	}
}//class
*/

/*
class A9{
	static int a=10;
	int x=20;

	static void m1() {
		System.out.println("A9 class M1");


	}
	 void m2() {
			System.out.println("A9 class M2");


		}
	 void m3() {
			System.out.println("A9 class M3");


		}
}

class Non_Static_Modification extends A9{
	static int a=50;
	int x=60;

	static void m1() {
		//super.m1();
		
		System.out.println("A8 class M1");



	}
	 void m2() {
			System.out.println("A8 class M2");
			super.m2();

		}
	 void m4() {
			System.out.println("A8 class M4");
            System.out.println(super.a+"....."+a);
            System.out.println(super.x+"....."+x);
            super.m1();
            m1();
            super.m2();
            m2();
            

		}


	public static void main(String[] args) {
		Non_Static_Modification ns=new Non_Static_Modification();
		ns.m4();
	}
		
}
*/