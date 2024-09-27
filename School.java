class Student{
    int id;
    String name;
   static String school= "ABC";

   public void Info(){
       System.out.print("Student id is "+this.id+" "); 
       System.out.print("Named "+this.name+" ");
       System.out.println("belongs to "+this.school);
    }
    public Student(int id, String name){
        this.id = id;
        this.name = name;
        
    }
}
public class School {
    public static void main(String[] args) {
        Student S1 = new Student(5, "amit");
        Student S2 = new Student(6, "Pradeep");
        S2.Info();
        S1.Info();
    }
}