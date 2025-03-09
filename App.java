public class App {
    public static void main(String[] args) throws Exception {
       
        Child c = new Child();
        c.printF();
        c.printM();

        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();
        Moon mo = new Moon();

        System.out.println(m instanceof SolarSystem);
        System.out.println(e instanceof SolarSystem);
        System.out.println(mo instanceof SolarSystem);
        System.out.println(mo instanceof Earth);
    }
}
