interface Animal {  //all function are public static and final
    int eyes =2;
    void walk();  //walk function only Initialize not implements here
}
class Horse implements Animal{ //have to add public in implement function
    public void walk(){  //walk function is implement by horse class 
        System.out.println("Horse is Running");
    }
}
public class MainClass {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();   
    }
}