

abstract class AbstractionClass {

    abstract void   turnOn();
    abstract void turnOff();

}

class TVremote extends AbstractionClass{

    @Override
    void turnOn(){
        System.out.println("TV is on");
    }

    @Override
    void turnOff(){
        System.out.println("TV is off");
    }
} 

class MMain{
    public static void main(String[] args) {
        AbstractionClass ob = new TVremote() ;
        
        ob.turnOff();
        ob.turnOn();
        
    }
}