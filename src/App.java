public class App {
    public static void main(String[] args) throws Exception {
      

        LamdaExpression le = (int x) -> 
        {
            System.out.println("This is a lambda expression with parameter x: " + x);
        };

        le.abstractFunction(5);
    }
}
