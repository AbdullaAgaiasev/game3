package kg.geektech.game.genaral;

import kg.geekteck.game.heroes.*;

import java.util.Random;

public class RPG_Game {
        private static int roundNumber;
        public static Random random = new Random();

        public static void start() {
            Boss boss = new Boss(1000, 50, "Breamter");
            Warrior warrior = new Warrior(288, 20, "Ogasavara");
            Magic magic = new Magic(270, 29, "Agnessa");
            Berserk berserk = new Berserk(275, 18, "Wreanrid");
            Saitama saitama = new Saitama(300,100,"Saitama");
            Hero[] heroes = {warrior, magic, berserk,saitama};

            printStatistics(boss, heroes);
            while (!isGameFinished(boss, heroes)) {
                playRound(boss, heroes);
            }
        }

        private static void playRound(Boss boss, Hero[] heroes) {
            roundNumber++;
            boss.chooseDefence(heroes);
            boss.attack(heroes);
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0 &&
                        boss.getDefence() != heroes[i].getAbility()) {
                    heroes[i].attack(boss);
                    heroes[i].applySuperPower(boss, heroes);
                }
            }
            printStatistics(boss, heroes);
        }

        private static boolean isGameFinished(Boss boss, Hero[] heroes) {
            if (boss.getHealth() <= 0) {
                System.out.println("Heroes won!!!");
                return true;
            }
            boolean allHeroesDead = true;
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0) {
                    allHeroesDead = false;
                    break;
                }
            }
            if (allHeroesDead) {
                System.out.println("Boss won!!!");
            }
            return allHeroesDead;
        }

        private static void printStatistics(Boss boss, Hero[] heroes) {
            System.out.println("ROUND " + roundNumber + " -----------");
            System.out.println(boss);
            for (int i = 0; i < heroes.length; i++) {
                System.out.println(heroes[i]);
            }
        }
    }


