////Program to demonstrate private data members, Constructors and getter and setter methods  
public class Person { 
private String personName; 
private int personAge; 
private String personCity; 
public String getPersonName() { 
return personName; 
} 
public void setPersonName(String personName) { 
this.personName = personName; 
} 
public int getPersonAge() { 
return personAge; 
} 
public void setPersonAge(int personAge) { 
this.personAge = personAge; 
} 
public String getPersonCity() { 
return personCity; 
} 
public void setPersonCity(String personCity) { 
this.personCity = personCity; 
} 
public Person() { 
System.out.println("Default Constructor"); 
} 
public Person(String personName, int personAge, String personCity) { 
System.out.println("Parameterized Constructor"); 
this.personName = personName; 
this.personAge = personAge; 
this.personCity = personCity; 
} 
} 
//Program to demonstrate creating objects 
import java.util.Scanner; 
public class PersonDemo { 
public static void main(String args[]) 
{ 
Person p1=new Person(); //default constructor invoked 
Scanner sc=new Scanner(System.in); 
String name, city; 
int age; 
System.out.println("Enter Person details : Name, age and city"); 
name=sc.nextLine(); 
age=sc.nextInt(); 
city=sc.nextLine(); 
//p1.personName=name private member can't accessible 
p1.setPersonName(name);p1.setPersonAge(age);p 1.setPersonCity(city); 
System.out.println("Person Details Name : "+p1.getPersonName()+"\tAge : "+p1.getPersonAge()+"\tCity : "+p1.getPersonCity()); 
System.out.println("Enter Person details : Name, age and city"); 
name=sc.nextLine(); 
age=sc.nextInt(); 
city=sc.nextLine(); 
p1=new Person(name, age, city); //parameterized constructor invoked); 
System.out.println("Person Details Name : "+p1.getPersonName()+"\tAge : "+p1.getPersonAge()+"\tCity : "+p1.getPersonCity()); 
sc.close(); 
} 
}
