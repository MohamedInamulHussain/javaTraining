//Program if..else statement 
public class IfElseDemo { 
public static void main(String[] args) { 
int age=21; 
if(age>=18) 
System.out.println(" You are eligible for Voting");  
else 
System.out.println("Sorry! You need to wait more"); 
} 
}

//Program to demonstrate Switch case 
public class ForEachLoopDemo { 
public static void main(String[] args) { 

char b='b';
switch(b){
case 'a':
    System.out.println("hi this is a");
    
case 'b':
    System.out.println("hi this is b");
   
default:
     System.out.println("hi this is default");
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
 
