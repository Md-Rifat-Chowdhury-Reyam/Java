public class App {
    public static void main(String[] args) throws Exception {
      


        // Using a lambda expression to implement the zeroEx interface

        zeroEx ze = () -> {
            System.out.println("This is a lambda expression implementing the zeroEx interface");
        };
        ze.display();





        LamdaExpression le = (int x) -> 
        {
            System.out.println("This is a lambda expression with parameter x: " + x);
        };

        le.abstractFunction(5);
    }
}
