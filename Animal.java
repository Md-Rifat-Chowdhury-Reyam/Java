

public class Animal{
         


    String name, breed, color; 

    public Animal(String name, String breed, String color ){


        this.name= name;
        this.breed = breed;
        this.color = color;

    }

    public String getName(){
        return name;
    }

    public String getBreed()
    {
        return breed;

    }
    public String getColor(){
        return color;
    }

    @Override public String toString()
    {
        return("This is Dog "+ this.getName()+", it is "+this.getBreed()+ ". Its color "+this.getColor());
    }

    public static void main(String[] args) {
        Animal obj = new Animal("Tom"," Bangladeshi","Black  & White");
        System.out.println(obj.toString());
        
    }
}