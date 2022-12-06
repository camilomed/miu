package Lesson7;


import java.util.*;  
import java.io.*;  
public class StudentComparable implements Comparable<Comparable>{  
int rollno;  
String name;  
int age;  
StudentComparable(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
public int compareTo(StudentComparable st){  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return 1;  
else  
return -1;  
}
 
}  
//Creating a test class to sort the elements  
public class TestSort3{  
public static void main(String args[]){  
ArrayList<Comparable> al=new ArrayList<Comparable>();  
al.add(new Comparable(101,"Vijay",23));  
al.add(new Comparable(106,"Ajay",27));  
al.add(new Comparable(105,"Jai",21));  
  
Collections.sort(al);  
for(Comparable st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  