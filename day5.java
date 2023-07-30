//Program to demonstrate Hierarchical Inheritance - Person Class 
class vehicle{
    String type;
    int wheeler;
    void Vehicle(){
        System.out.println("enter your vehicle details");
    }
}
class car extends vehicle{
    String model;
    int number;
    void Car(){
        type="car";
        wheeler=4;
        System.out.println(type+" "+wheeler);
    }
}
class audi extends car{
    void Audi(){
        model="Audi Car";
        number=23453;
        System.out.println(model+" "+number);
    }

    public static void main(String[]args){
        audi a=new audi();
        a.Vehicle();
        a.Car();
        a.Audi();
    }
}
