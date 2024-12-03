package com.megha.interfaces;

//we can't access directly specialized methods by an interface ref
interface Bird {
    void eat();
    void fly();
}

class SerpentEagle implements Bird {
    @Override
    public void eat() {
        System.out.println("Serpent eagle eats snakes");
    }

    @Override
    public void fly() {
        System.out.println("Serpent eagle flies at higher heights");
    }

    public void serpentEagleSpecialProperty() {
        System.out.println("Can't swim");
    }
}

class GoldenEagle implements Bird {
    @Override
    public void eat() {
        System.out.println("Golden eagle eats fishes");
    }

    @Override
    public void fly() {
        System.out.println("Golden eagle flies at lower heights");
    }

    public void goldenEagleSpecialProperty() {
        System.out.println("Can swim");
    }
}

class BirdFamily {
    void birds(Bird ref) {
        ref.fly();
        ref.eat();
        //ref.serpentEagleSpecialProperty();can't access specialized methods by interface ref 
        //down casting
        if (ref instanceof SerpentEagle) {
            ((SerpentEagle)(ref)).serpentEagleSpecialProperty();
        }
        else if (ref instanceof GoldenEagle) {
        	((GoldenEagle)(ref)).goldenEagleSpecialProperty();
        }
    }
}

public class Rule4 {
    public static void main(String[] args) {
        SerpentEagle se = new SerpentEagle();
        GoldenEagle ge = new GoldenEagle(); 
        BirdFamily bf = new BirdFamily();
        bf.birds(se);  
        bf.birds(ge);  
    }
}
