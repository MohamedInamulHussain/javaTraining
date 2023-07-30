//Program to demonstrate encapsulation 

import java.util.Scanner; 
class student{
   private String name;
   private int id;
   private int rank;
   public void setName(String name){
       this.name=name;
   } 
   public String getName(){
       return name;
   } 
    public void setId(int id){
       this.id=id;
   } 
   public int getId(){
       return id;
   }
    public void setRank(int rank){
       this.rank=rank;
   } 
   public int getRank(){
       return rank;
   }
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       
       
       student s=new student();
       
       String name=sc.nextLine();
       s.setName(name);
       
       
       int id=sc.nextInt();
        s.setId(id);
       
       
       int rank=sc.nextInt();
       s.setRank(rank);
       System.out.println(s.getName());
       System.out.println(s.getId());
       System.out.println(s.getRank());
   }
}
