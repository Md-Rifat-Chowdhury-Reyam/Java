abstract class animal{

  

    public abstract void eat(String eat);
    public abstract void sleep( String sleep);

}

class Lion extends animal
{
  
    @Override
    public void eat(String eat)
    {
        System.out.println("Lion eats "+ eat);

    }
    @Override
    public void sleep( String sleep)
    {
        System.out.println("Lion sleeps "+ sleep);
    }


}

public class AnimalTest{
    public static void main(String[] args) {
        
        Lion l = new Lion();
        l.eat("meat");
        l.sleep("in the jungle"); 
    }
}