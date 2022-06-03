import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name, weapon;
    private int hitPoints, strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player { name=" + this.name + ", hitPoints=" + this.hitPoints + ", strength=" + this.strength + ", weapon=" + this.weapon + "}";
    }

    @Override
    public List<String> write() {
        List<String> info = new ArrayList<>();
        info.add(this.name);
        info.add(Integer.toString(this.hitPoints));
        info.add(Integer.toString(this.strength));
        info.add(this.weapon);
        return info;
    }

    @Override
    public void read(List<String> list) {
        if(!list.isEmpty() ) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
            this.weapon = list.get(3);
        }
    }
}
