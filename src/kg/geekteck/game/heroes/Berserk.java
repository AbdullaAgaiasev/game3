package kg.geekteck.game.heroes;

import java.util.Random;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    public void setSavedDamage() {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        //public static void berserkShoot () {
            Random random = new Random();
            int randomDamage = random.nextInt(15) + 7;
            int randomC = random.nextInt(3) + 1; {
                switch (randomC) {
                    case 1:
                        savedDamage = (savedDamage + boss.getHealth()) - randomDamage;
                        System.out.println("Урон от Берсерка критический " + randomDamage);
                        break;
                    case 2:
                        boss.setDamage(23);
                        break;
                }
            }

        }

    }



