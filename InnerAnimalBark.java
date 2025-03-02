package Interface;

public interface InnerAnimalBark {

    
void bark();
}


class Dog implements InnerAnimalBark{
    @Override
    public void bark()
    {
        System.out.println("Dog is Barking");
    }
    
}




 class Main {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.bark();
        

    }
    
}
