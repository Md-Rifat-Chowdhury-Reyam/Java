package HelloApp;


class Student{
    public int roll;
    public String name;

    Student(int roll, String name)
    {
        this.roll= roll;
        this.name= name;
    }

}

public class Main{
    public static void main(String[] args) {
        
        Student[] arr;
        arr = new Student[5];

        arr[0]= new Student(1, "Rifat");
        arr[1]= new Student(2, "Ri");

        for(int i= 0; i<arr.length; i++)
        System.out.println(" index "+ i +" roll "+ arr[i].roll+ " name "+ arr[i].name);
    }

}