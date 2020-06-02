package com.nt;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);		
		Student p=new Student();
		Faculty f=new Faculty();
		
		System.out.println("enter name:");
		String name=scn.nextLine();
		p.setName(name);
 
		System.out.println("enter eyes:");
		int eye=scn.nextInt();
		p.setEye(eye);

		System.out.println("enter ears:");
		int ears=scn.nextInt();
		p.setEars(ears);

		System.out.println("enter legs:");
		int legs=scn.nextInt();
		p.setLegs(legs);

		System.out.println("enter hands:");
		int hands=scn.nextInt();
		p.setHands(hands);

		
		System.out.println("enter mobilno:");
		Long mobilNo=scn.nextLong();
		p.setMobilNo(mobilNo);

		System.out.println("enter sno:");
		int sno=scn.nextInt();
		p.setSno(sno);


		System.out.println("enter fee:");
		Double fee=scn.nextDouble();
		p.setFee(fee);
		
		System.out.println("enter Course:");
		String course=scn.nextLine();
		p.setCourse(course);
 






		System.out.println();
		System.out.println("*****************                   Properties                   ********************");

		p.display();

		System.out.println("*****************                    Behaivours               ********************");
		//person
		System.out.println("Person Behaivours*******************************");
		p.eat();
		p.learn();
		p.sleep();
		//student
		System.out.println("Student Behaivours************************");
		p.eat();
		p.learn();
		p.sleep();
		p.listen();
		p.read();
		p.writeExam();

		System.out.println("***************************************************************************");
		System.out.println("enter eyes:");
		int eye1=scn.nextInt();
		f.setEye(eye1);

		System.out.println("enter ears:");
		int ears1=scn.nextInt();
		f.setEars(ears1);

		System.out.println("enter legs:");
		int legs1=scn.nextInt();
		f.setLegs(legs1);

		System.out.println("enter hands:");
		int hands1=scn.nextInt();
		f.setHands(hands1);

		/*
				System.out.println("enter name:");
				String name=scn.nextLine();
				p.setName(name);
		 */
		System.out.println("enter mobilno:");
		Long mobilNo1=scn.nextLong();
		f.setMobilNo(mobilNo1);


		System.out.println("enter FacultyNo:");
		int fno=scn.nextInt();
		f.setFno(fno);


		System.out.println("enter Salary:");
		Double sal=scn.nextDouble();
		f.setSal(sal);
		System.out.println();
		System.out.println("*****************                   Properties                   ********************");

		f.display();

		System.out.println("*****************                    Behaivours               ********************");
		//person
		System.out.println("Person Behaivours*******************************");
		p.eat();
		p.learn();
		p.sleep();
		//Faculty
		System.out.println("Faculty Behaivours************************");
		p.eat();
		p.learn();
		p.sleep();
		f.teach();
		f.conductingExam();


		scn.close();

	}

}
