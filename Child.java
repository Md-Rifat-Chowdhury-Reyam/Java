public class Child implements MulipleInheritanceMother, MultipleInheritanceFather {

    @Override
    public void printF()
    {
        System.out.println("I am son of Father");

    }

    @Override
    public void printM()
    {
        System.out.println("I am son of Mother");
    }

    
    
}
