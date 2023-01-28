package ExSuperPerson;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Person c1 = new Person("ginger", "mcDebole");
        System.out.println(
                 " name= " + c1.getName()
                + " address " + c1.getAddress());
        System.out.println(c1);

        Student c2 = new Student("giovanni", "via gluck","mathematics", 1,8000.0);
        System.out.println(
                 " program " + c2.getProgram()
                + " fee " + c2.getFee()
                + " year " + c2.getYear()
                );
        System.out.println(c2);

        Staff c3 = new Staff("giobbe", "via ruote","ingegneria", 800.0);
        System.out.println(
                " school " + c3.getSchool()
                + " pay " + c3.getPay()
               + " name " + c3.getName());
        System.out.println(c3);

    }
}