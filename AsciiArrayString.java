
package String;

public class AsciiArrayString { 


    public static void main(String[] args)
    {
        byte ascii[] = {82,73, 70, 65, 84 };

        String str = new String(ascii);

        System.out.println(str);


        String secondString = new String (ascii,0,1);
        System.out.println(secondString);


        char character[]= { 'R','i','f','a','t'};

        String strr = new String(character);

        System.out.println(strr);

        String newS= new String(strr);
        System.out.println(newS);

    }
}