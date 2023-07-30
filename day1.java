//Simple java program 

public class FirstProgram { 
public static void main(String[] args) { 
System.out.println("Hello World"); 
} 
} 

//program add two numbers
public class addition { 
public static void main(String[] args) { 
int a=10;
int b=20;
int c=a+b;
System.out.println(c);
} 
} 
//program with characters and strings
public class character { 
public static void main(String[] args) { 
char a='A';
String s="Hello Java";  
System.out.println(a);
System.out.println(s);
//concating char and string
System.out.println("The final String is :"+a+" "+s);
} 
} 
//type conversion
public class typeConversion { 
public static void main(String[] args) { 
  int a=10;
  int b=3;
  float c=a/b;
  System.out.println(c);//this will give output as 3 but we need 3.333..
  float d=(float)a/(float)b;
  System.out.println(c);//this will give output as 3.333
  
} 
} 



