package HumanClass;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;
import static java.lang.System.out;
import static sun.misc.Version.print;


public class Human {
    public String name;
    public int age;
    public String gender;
    public String occupation;
    public String address;


    public Human(String name, int age, String gender, String occupation, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
    }



    public void getName() {
        System.out.println(this.name);
    }

    public void getAge(){
        System.out.println(this.age);
    }

    public void getGender(){
        System.out.println(this.gender);
    }

    public void getAddress(){
        System.out.println(this.address);
    }
    public void getOccupation(){
        System.out.println(this.occupation);
    }
}
