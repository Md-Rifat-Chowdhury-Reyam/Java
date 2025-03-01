abstract class Animal{
    private String name;

    public Animal(String name)
    {
        this.name= name;

    }
    public abstract void makeSound();

    public String getName()
    {
        return name;
    }    
}

class Dog extends Animal{
    public Dog(String name)
    {
        super(name);
    }

    @Override
    public void makeSound()
    {
        System.out.println(getName()+" Barking");
    }
}


class cat extends Animal{
    public cat ( String name)
    {
        super(name);
    
    }
    @Override
    public void makeSound()
    {
        System.out.println(getName()+" Meowing");
    }
}

class Test{
    public static void main(String[] args) {
        Animal a = new Dog ("Dog");
        Animal a1 = new cat("Cat");
        a.makeSound();
        a1.makeSound();
    }
}
