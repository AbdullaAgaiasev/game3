package kg.geekteck.game.heroes;

import java.util.Random;

public class Magic extends Hero {
    public static Random RandomDamage = new Random();
        public Magic(int health, int damage, String name) {
            super(health, damage, SuperAbility.BOOST, name);
        }

    @Override
        public void applySuperPower(Boss boss, Hero[] heroes) {
            for (int i = 0; i < heroes.length; i++) {
                if (this.getDamage() > 17);
                System.out.println(" Все игроки стали мощнее на " + RandomDamage);
            }

        }
    }


