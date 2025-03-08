public class GrandFather {
    
    String nameG;
    String nameF;
    String nameS;

    public void printGrandfather(String nameG, String nameF, String nameS)

    {
        this.nameF= nameF;
        this.nameG = nameG;
        this.nameS = nameS;

        System.out.println("I am father of "+nameF);
    }
    
}
