package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat alice = new HouseCat("Alice",10);
        System.out.println(alice.getFamily() + "\n" + alice.getWeight() + "\n" + alice.getClass());
        System.out.println(alice.noise());
        System.out.println(alice.isSatisfied() + "\n" + alice.isHungry() + "\n" + alice.isTired());
        alice.eat();
        System.out.println(alice.isSatisfied() + "\n" + alice.isHungry() + "\n" + alice.isTired());
        alice.sleep();
        System.out.println(alice.isSatisfied() + "\n" + alice.isHungry() + "\n" + alice.isTired());
        System.out.println(alice.purr());
        alice.eat();
        System.out.println(alice.isSatisfied() + "\n" + alice.isHungry() + "\n" + alice.isTired());
        HouseCat underfoot = new HouseCat("UnderFoot");
        System.out.println(underfoot.getWeight());
        underfoot.eat();
        System.out.println(underfoot.isTired());
        System.out.println(underfoot.noise());
    }
}
