public class Hero {
     int health;
     int damage;
     String superSkill;

    public Hero (int health,int damage,String superSkill) {
        this.health = health;
        this.damage = damage;
        this.superSkill = superSkill;
    }
    public Hero (int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperSkill() {
        return superSkill;
    }
}
