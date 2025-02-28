public class methodPass {

    String name;
    int id;
     String BloodG;


     public void PrintStudent()
     {
        System.out.println(" The student Name is "+ name);
        System.out.println(" ID: "+id+ " blood: "+BloodG);
     }
    
}

class MMain{

    public static void main(String[] args) {
        methodPass ob = new methodPass();
    
        ob.name= " Rifat";
        ob.id = 19415613;

        ob.BloodG= "B+";

        ob.PrintStudent();
    }
}
