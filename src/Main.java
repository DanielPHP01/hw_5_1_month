import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefence("SpiderMan");
        System.out.println("Health " + boss.getHealth() + " Damage " + boss.getDamage() + " Defence " + boss.getDefence());




    }
// не смог вернуть результат метода

    public static Hero createHeroes(Hero[] heroes) {

        Hero capitanAmerica = new Hero(250,30,"shield");
        Hero spiderMan = new Hero(150, 25, "ShotWeb");
        Hero doctorStrange = new Hero(200, 80, "Magical");


        for (Hero hero : heroes) {
            System.out.println(hero.getHealth() + hero.getDamage() + hero.getSuperSkill());
            return hero;
        } return createHeroes(heroes);






    }
}
