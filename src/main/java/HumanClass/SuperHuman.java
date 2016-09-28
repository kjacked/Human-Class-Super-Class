package HumanClass;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;
import static sun.misc.Version.print;

class SuperHuman extends Human {
    private String allegiance;
    private String heroName;
    private String superAbility;

    public SuperHuman(String name, int age, String allegiance, String heroName, String superAbility, String gender, String occupation, String address) {
        super(name, age, gender, occupation, address);
        this.allegiance = allegiance;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }
    public String getGoodorBad(){
        return this.allegiance;
    }
    public String getHeroName(){
        return this.heroName;
    }
    public String getSuperAbility(){
        return this.superAbility;
    }

    public static void main (String[] args) {
        Human kyle = new Human("Kyle", 23, "Male", "Student", "400 java drive");
        SuperHuman john = new SuperHuman("john", 25, "good", "Jax", "Flying", "male", "objectifier", "100 green st");
        SuperHuman jeff = new SuperHuman("jeff", 30, "bad", "Ahri", "Polymorphism", "male", "scientist", "200 blue st");
        SuperHuman bob = new SuperHuman("bob", 35, "good", "Skarner", "Projectiles", "male", "lawyer", "300 yellow st");
        println(kyle.name);
        System.out.println(kyle.age);
        println(kyle.gender);
        println(kyle.address);
        println(kyle.occupation);
        println(jeff.getGoodorBad());
        println(john.getSuperAbility());
        println(bob.getHeroName());

    }
}


