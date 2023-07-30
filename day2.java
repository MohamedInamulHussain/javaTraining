//Program to guess a number in a given range 
public class IfDemo { 
public static void main(String[] args) { 
int x = 5; 
if (x != 5) 
System.out.println("Value of x is not 5"); 
System.out.println("Value of x is 5"); 
} 
} 
//Program to demonstrate if..else statement 
public class IfElseDemo { 
public static void main(String[] args) { 
int age=11; 
if(age>=18) 
System.out.println(" You are eligible for Voting");  
else 
System.out.println("Sorry! You need to wait more"); 
System.out.println("if else demonstration"); 
} 
}

  
//Nestedifelse 
public class NestedIfElseDemo { 
public static void main(String[] args) { 
int a=10, b=20, c=5; 
System.out.println("The largest number is"); 
if (a > b) { 
if (a > c) 
System.out.println(a); 
else 
System.out.println(c); 
} else { 
if (c > b) 
System.out.println(c); 
else 
System.out.println(b); 
} 
} 
} 


//Program to demonstrate Switch case 
public class SwitchDemo  
{ 
public static void main(String[] args) { 
char x = 'l'; 
switch (x)  
{ 
case 'l' :  
case 'L' :  
System.out.println(x+" is a Letter"); 
break; 
case 'd': 
case 'D' : 
System.out.println(x+" is a Digit"); 
break; 
case 'w': 
case 'W' :  
System.out.println(x+" is White Space"); 
break; 
case 's': 
case 'S': 
System.out.println(x+" is Special Symbol"); 
default: 
System.out.println(x+" is other than letter, digit, space or special symbol "); 
break; 
} 
} 
} 


//Program to demonstrate decision making operators 
public class DecisionMakingWithOperators { 
public static void main(String[] args) { 
int x = 8, y = 7; 
int a = 10; 
int b = 11; 
if (x >= y) { 
System.out.println("true"); 
} else { 
System.out.println("false"); 
} 
if (!(a < b) || (a == b)) { 
System.out.println("Condition is TRUE"); 
} else 
{ 
System.out.println("Condition is FALSE"); 
} 
} 
} 
//Program to demonstrate while do loop 
public class WhileDemo { 
public static void main(String[] args)  
{ 
int i=99; 
while(i<=100) 
{ 
System.out.println(i); 
i++; 
} 
} 
} 
//Program to demonstrate for loop 
public class ForLoopExample { 
public static void main(String[] args)  
{  
for(int i = 1; i<=1000 ; i++) //(int i = 1000; i<=1;i--) 
{  
System.out.print("Value of i:"); 
System.out.println(i); 
} 
} 
} 


//Program to demonstrate for each loop 
public class ForEachLoopDemo { 
public static void main(String[] args) { 
int a[]= {10,20,30,40,50};  
//for integer array 
for(int i:a) 
{ 
System.out.println(i);  
} 
char ch[]= {'j','a','v','a'}; 
for(char c:ch) 
{ 
System.out.print(c);  
} 
System.out.println(" "); 
String s1[]= {"Java","programming","learning"}; 
//for String array 
for(String s:s1) 
{ 
System.out.print(s+" ");  
} 
} 
} 


//Program to demonstrate do while loop 
public class DoWhileDemo { 
public static void main(String[] args) { 
int i = 11; 
do { 
System.out.println(i); 
i++; 
} while (i <= 1); 
} 
} 


//Program to demonstrate different operators(ternary,airthmetic,pre/post incrementation/decrementation) in java 
public class OperatorsDemo { 
public static void main(String args[]) { 
int a = 10; 
int b = 20; 
int x = 10; 
System.out.println("a and b value before the operations: " + a + " " + b); 
++a; 
int c = ++a + b + a--; 
System.out.println("c value after the operations: " + c); 
int d = c++ + a + b--; 
System.out.println("d value after the operations: " + d); 
System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d); 
//Ternary operator demonstration 
x = (10 == x) ? 1 : 0;  
System.out.println(x); 
} 
} 


//Program to demonstrate continue statement 
public class ContinueDemo { 
public static void main(String[] args) { 
for (int k = 5; k < 15; k++) 
{ 
// Odd numbers are skipped 
if (k%2 != 0) 
continue; 
// Even numbers are printed 
System.out.print(k + " "); 
} 
} 
} 


//Program to demonstrate break statement 
public class BreakDemo { 
public static void main(String[] args) { 
for (int i = 5; i < 10; i++) { 
if (i == 5) 
break; 
System.out.println(i); 
} 
} 
} 