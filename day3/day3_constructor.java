////Program to demonstrate Constructor  
class student{
    //default constructor
    public student(){
        System.out.println("default constructor");
    }
    //parameterized constructor
    public student(int id,String name){
        System.out.println("name:"+name+"id:"+id);
    }
    public static void main(String[]args){
        student s1=new student();
        student s2=new student(1,"ajay");
        
    }
}
