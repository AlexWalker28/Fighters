package kg.kloop.android.julysandbox;

public class Warrior extends Fighter {

    private int endurance;

    public Warrior(int health, double armour, int kickPower, int endurance) {
        super(health, armour, kickPower);
        this.endurance = endurance;
    }

    public void superKick(Fighter fighter) {
        int health = fighter.getHealth();
        fighter.setHealth(health - getKickPower());
        endurance -= getKickPower();
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
}
