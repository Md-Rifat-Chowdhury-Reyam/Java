package Variables;

public class instance {

    public String fname;
    public int i;

    public instance()

    {
        this.fname= "Rifat";    
    }

    public static void main(String[] args) {
        
        instance nm = new instance();

        System.out.println("his name is "+ nm.fname);
    } 
}