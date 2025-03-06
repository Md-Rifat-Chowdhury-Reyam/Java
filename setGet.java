

public class setGet {

    static String CustomerName;
    static int CustomerSalary;


    static void set(String n, int s)
    {
        CustomerName= n;
        CustomerSalary= s;

        
                 
    }

    static void get()
    {
        System.out.println(" Customer Name " +CustomerName);
        System.out.println("Customer Salary "+ CustomerSalary);
    }


    public static void main(String[] args) {
        setGet.set("Md. Rifat Chowdhury", 20000);
        setGet.get();
    }
}
