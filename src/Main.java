public class Main {
    public static void main(String[] args) {

        Boss bossFirst = new Boss(700,50,"Master");

        System.out.println("Health " + bossFirst.getHealth() + " Damage " + bossFirst.getDamage() + " Defence " + bossFirst.getDefence());

    }
}