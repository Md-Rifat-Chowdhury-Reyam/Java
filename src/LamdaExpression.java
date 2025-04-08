 interface LamdaExpression
{

    void abstractFunction(int x);

    default void functionNonAbs()
    {
        System.out.println("This is a non-abstract function in the interface LamdaExpression");
    }

    
    
    
}    