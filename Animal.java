public class Animal{

    String name, breed, color;

    public Animal(String name, String breed, String color)
    {
        this.name = name;
        this.breed = breed;
        this.color= color;

    }

    public String getName()
    {return name;}

    public String getBreed()
    {return breed;}

    public String getColor(){
        return color;
    }

    @Override public String toString(){
        return("This is Cat  name is "+this.getName()+" its breed from "+ this.getBreed()+" its color "+this.getColor());
        

    }



    public static void main(String[] args) {
        Animal obj = new Animal("pussy", "Australian"  , "White");
        System.out.println(obj.toString());
        
    }
}