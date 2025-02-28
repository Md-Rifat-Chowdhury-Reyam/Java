public class SETGetObject {

    static String name;
    static String country;


    static void set(String n, String c )
    {
        name= n;
        country = c;

    }

    static void get()
    {
        System.out.println(" Hi I am "+ name);
        System.out.println(" I am from"+ country);
    }

    public static void main(String[] args) {
        SETGetObject.set(" Rifat", " Bangladesh");
        SETGetObject.get();
    }
    
}
