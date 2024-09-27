class Dog{
	String breed;
	String colour;
	static int legs = 4;
    static int eyes = 2;
   public void bark(){
        System.out.println("Dog is barking");
    }
}
class Lebra extends Dog{
	public void Info(){
		System.out.println("Dog have "+this.eyes+" eyes and "+this.legs+" legs "+this.breed+this.colour);
}
}
public class Dogs{
public static void main(String[] args){
    Lebra L = new Lebra();
	L.breed = " Lebra dog ";
	L.colour = "black";
	L.Info();
    L.bark();
}
}