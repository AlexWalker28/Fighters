package kg.kloop.android.julysandbox;

public class Fighter {
    private int health;
    private double armour;
    private int kickPower;

    public Fighter(int health, double armour, int kickPower) {
        this.health = health;
        this.armour = armour;
        this.kickPower = kickPower;
    }

    public void kick(Fighter fighter) {
        int health = fighter.getHealth();
        double armour = fighter.getArmour();
        fighter.setHealth(health - (int) (kickPower * armour));
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getArmour() {
        return armour;
    }

    public void setArmour(double armour) {
        this.armour = armour;
    }

    public int getKickPower() {
        return kickPower;
    }

    public void setKickPower(int kickPower) {
        this.kickPower = kickPower;
    }
}
