package Excercise;
abstract class animalSound {

    String sound;

    public abstract void Sound();
    
}

class Lion extends animalSound
{
    @Override

    public void Sound()
    {
        System.out.println("Lion's sound is Roar");
    }
}

class Tiger extends animalSound{

    @Override
    public void Sound()
    {
        System.out.println("Tiger's Sound is Roar");
    }
}

public class MainTest{
    public static void main(String[] args) {
        Lion l = new Lion();
        l.Sound();
    Tiger t = new Tiger();
t.Sound();
}

    
}