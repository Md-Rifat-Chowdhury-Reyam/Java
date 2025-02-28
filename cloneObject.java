public class cloneObject implements Cloneable{


    @Override
    protected Object clone()

    throws CloneNotSupportedException
    {
        return super.clone();

    }


    String name = " Rangpur";




    public static void main(String[] args) {
        cloneObject ob = new cloneObject();


        try{
            cloneObject cl = (cloneObject) ob.clone();
            System.out.println(cl.name);
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}