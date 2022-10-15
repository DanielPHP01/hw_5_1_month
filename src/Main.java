public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefence("SpiderMan");
        System.out.println("Health " + boss.getHealth() + " Damage " + boss.getDamage() + " Defence " + boss.getDefence());
        for (int i = 0; i < createHero().length; i++) {
            System.out.println(" Hero health  = " + createHero()[i].getHealth() + " Damage = " + createHero()[i].getDamage() + " SuperSkill " + createHero()[i].getSuperSkill());
        }


    }
// не смог вернуть результат метода


    public static Hero[] createHero() {
        Hero capitanAmerica = new Hero(250, 30, "Shield");
        Hero spiderMan = new Hero(150, 25, "Shotweb");
        Hero doctorStrange = new Hero(200, 80, "Magical");

        Hero[] showHeroes = {capitanAmerica, spiderMan, doctorStrange};
        return showHeroes;
    }
}



