/*
Write a Java program to create class Student.
The class should have attributes student ID, student name, marks for 3 subjects and the member functions are setdata() and displaydata(). 
Calculate the average marks for student. 
*/

import java.util.Scanner;

class student{
    double a,b,c,avg;
    String name;
    int sid;
    
    public void setdata(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Student ID: ");
            sid = sc.nextInt();
            System.out.print("Enter Student Name: ");
            name = sc.next();
            System.out.print("Enter Marks of 1st Subject: ");
            a = sc.nextDouble();
            System.out.print("Enter Marks of 2nd Subject: ");
            b = sc.nextDouble();
            System.out.print("Enter Marks of 3rd Subject: ");
            c = sc.nextDouble();
        }
        avg = (a+b+c)/3;
    }
    
    public void displaydata(){
        System.out.print("\n");
        System.out.println("Student Id: "+sid);
        System.out.println("Student Name: "+name);
        System.out.println("Marks of Subject 1: "+ a);
        System.out.println("Marks of Subject 2: "+ b);
        System.out.println("Marks of Subject 3: "+ c);
        System.out.println("Average Marks: "+avg);
    }

}

public class Exp17 {

    public static void main(String[] args) {
        student xyz = new student();
        xyz.setdata();
        xyz.displaydata();
    }
}
