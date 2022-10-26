package kg.geekteck.game.heroes;

import java.util.Random;
public class Saitama extends Hero{
    private int DamageSaitama;
    public Saitama(int health, int damage, String name) {
        super(health, damage, SuperAbility.ONE_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        {
            Random random = new Random();
            boolean Saitama = random.nextBoolean();
            if (Saitama) {
                 if (boss.getDamage() < 150 );
                System.out.println(" Saitama нанес 1 мощный удар ");

            }

        }

    }
}
