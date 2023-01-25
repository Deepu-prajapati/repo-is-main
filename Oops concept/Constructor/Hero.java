package Constructor;

import java.util.ArrayList;

public class Hero {

    public static class Kratos{
        int strength;
        int level;
        ArrayList<String> weapon = new ArrayList<>();
        String defaultWeapon;

        Kratos(){
            strength = 100;
            level = 01;
            weapon = new ArrayList<>();
            defaultWeapon = "Gun";
        }
        void level(){
            level++;
        }
    }
    public static void main(String[] args) {
        
        Kratos newHero = new Kratos();
        
        System.out.println(newHero.strength);

        newHero.level();
        
        System.out.println(newHero.level);
        System.out.println(newHero.weapon);
        System.out.println(newHero.defaultWeapon);
    }
}

