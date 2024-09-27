abstract class Dog{
	String breed;
	String colour;
	static int legs = 4;
    static int eyes = 2;
   public void bark(){
        System.out.println("Dog is barking");
    }
}
class Pitbull extends Dog{
    String breed;
	String colour;
	
	public void Info(){
		System.out.println("Dog have "+this.eyes+" eyes and "+this.legs+" legs "+this.breed+this.colour);
}
}
public class Abstract{
public static void main(String[] args){
    Pitbull P = new Pitbull();
	P.breed = " Pitbull dog ";
	P.colour = "black";
	P.Info();
    P.bark();
}
}